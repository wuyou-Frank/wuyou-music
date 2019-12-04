package com.controller;

import com.entity.SongListEntity;
import com.github.pagehelper.PageInfo;
import com.service.SongListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class SongListComtroller {
    @Autowired
    private SongListService songListService;

    @RequestMapping("/songlist")
    public String songlist(@RequestParam(value = "pageNum",required = false,defaultValue = "1")int pageNum,
                           @RequestParam(value = "pageSize",required = false,defaultValue = "5")int pageSize,
                           Model model){
        int id = pageNum;
        List<SongListEntity> songlist = songListService.getAll(pageNum,pageSize,id);
        PageInfo pageInfo = new PageInfo(songlist);
        model.addAttribute("songlist",pageInfo);
        return "fe/viewsonglist/songlist";
    }
}
