package com.controller;

import com.dao.SongSheetDao;
import com.entity.ClassificationEntity;
import com.entity.CommunityEntity;
import com.entity.SongSheetEntity;
import com.github.pagehelper.PageInfo;
import com.service.ClassificationService;
import com.service.CommunityService;
import com.service.SongSheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ClassificationController {
    @Autowired
    private ClassificationService classificationService;
    @Autowired
    private CommunityService communityService;
    @Autowired
    private SongSheetService songSheetService;

    @RequestMapping("/songsheet")
    public String select(
            @RequestParam(value = "pageNum",required = false,defaultValue = "1")int pageNum,
            @RequestParam(value = "pageSize",required = false,defaultValue = "5")int pageSize,
            Model model){

        int id = pageNum;
        System.out.println("pageNum = " + pageNum);
        System.out.println("pageSize = " + pageSize);
        List<ClassificationEntity> classification = classificationService.getAll();
        List<CommunityEntity> community = communityService.getAll();
        List<SongSheetEntity> songSheet = songSheetService.getAll(pageNum,pageSize,id);
        model.addAttribute("classification",classification);
        model.addAttribute("community",community);
        model.addAttribute("songSheet",songSheet);
        return "fe/viewsongsheet/view";
    }
}