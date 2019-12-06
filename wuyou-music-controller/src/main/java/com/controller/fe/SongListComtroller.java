package com.controller.fe;

import com.entity.SongListEntity;
import com.github.pagehelper.PageInfo;
import com.service.SongListService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class SongListComtroller {
    @Autowired
    private SongListService songListService;

    @RequestMapping("/songlist")
    public String songlist(@RequestParam(value = "pageNum",required = false,defaultValue = "1")int pageNum,
                           @RequestParam(value = "pageSize",required = false,defaultValue = "2")int pageSize,
                           @RequestParam(value = "id",required = false,defaultValue = "1")int id,
                           Model model){
        List<SongListEntity> songlist = songListService.getAll(pageNum,pageSize,id);
        PageInfo pageInfo = new PageInfo(songlist);
        model.addAttribute("songlist",pageInfo);
        model.addAttribute("id",id);
        return "fe/viewsonglist/songlist";
    }
    @RequestMapping("/songlist/select")
    public String select(
            @RequestParam(value = "pageNum",required = false,defaultValue = "1")int pageNum,
            @RequestParam(value = "pageSize",required = false,defaultValue = "1")int pageSize,
            String name, Model model){
        System.out.println("name = " + name);
        List<SongListEntity>  result = songListService.getByNmae(pageNum,pageSize,name);
        PageInfo pageInfo = new PageInfo(result);
        model.addAttribute("name",name);
        model.addAttribute("result",pageInfo);
        return "fe/search";
    }
}
