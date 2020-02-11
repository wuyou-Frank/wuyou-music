package com.controller.fe;

import com.entity.CommentEntity;
import com.entity.CommentreplyEntity;
import com.entity.SongListEntity;
import com.github.pagehelper.PageInfo;
import com.service.CommentService;
import com.service.CommentreplyService;
import com.service.SongListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class SongListController {
    @Autowired
    private SongListService songListService;
    @Autowired
    private CommentService commentService;
    @Autowired
    private CommentreplyService commentreplyService;

    //查询歌曲列表
    @RequestMapping("/songlist")
    public String songlist(@RequestParam(value = "pageNum",required = false,defaultValue = "1")int pageNum,
                           @RequestParam(value = "pageSize",required = false,defaultValue = "2")int pageSize,
                           @RequestParam(value = "id",required = false,defaultValue = "1")int id,
                           Model model){
        List<SongListEntity> songlist = songListService.getAll(pageNum,pageSize,id);
        PageInfo pageInfo = new PageInfo(songlist);
        model.addAttribute("songlist",pageInfo);
        model.addAttribute("id",id);
        return "fe/songlist/songlist";
    }
    //搜索操作
    @RequestMapping("/songlist/select")
    public String select(
            @RequestParam(value = "pageNum",required = false,defaultValue = "1")int pageNum,
            @RequestParam(value = "pageSize",required = false,defaultValue = "1")int pageSize,
            String name, Model model){
        List<SongListEntity>  result = songListService.getByNmae(pageNum,pageSize,name);
        PageInfo pageInfo = new PageInfo(result);
        model.addAttribute("name",name);
        model.addAttribute("result",pageInfo);
        return "fe/search";
    }
    //查询某条歌曲的信息
    @RequestMapping("/song")
    public String song(@RequestParam(value = "pageNum",required = false,defaultValue = "1")int pageNum,
                       @RequestParam(value = "pageSize",required = false,defaultValue = "1")int pageSize,
                       String slname,String sname,int slid,Model model){
        SongListEntity songListEntity = songListService.getSong(slname, sname, slid);
        List<CommentEntity> commentEntities = commentService.getAll(pageNum,pageSize,slid);
        List<CommentreplyEntity> commentreplyEntities = null;
        for (CommentEntity commentEntity : commentEntities) {
            commentreplyEntities = commentreplyService.getAll(commentEntity.getCommentid());
        }
        model.addAttribute("songListEntity",songListEntity);
        model.addAttribute("commentEntities",commentEntities);
        model.addAttribute("commentreplyEntities",commentreplyEntities);
        return "fe/songlist/song";
    }
}
