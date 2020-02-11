package com.controller.fe;

import com.entity.CommentEntity;
import com.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CommentController {
//    @Autowired
//    private CommentService commentService;
//    @RequestMapping("")
//    public String comment(@RequestParam(value = "pageNum",required = false,defaultValue = "1")int pageNum,
//                          @RequestParam(value = "pageSize",required = false,defaultValue = "10")int pageSize,
//                          int slid, Model model){
//        List<CommentEntity> commentEntities = commentService.getAll(pageNum,pageSize,slid);
//        model.addAttribute("commentEntities",commentEntities);
//        return "";
//    }
}
