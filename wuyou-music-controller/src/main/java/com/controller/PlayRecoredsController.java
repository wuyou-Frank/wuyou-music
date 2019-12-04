package com.controller;

import com.dao.SongSheetDao;
import com.entity.AdminloginEntity;
import com.entity.PlayRecoredsEntity;
import com.entity.SongListEntity;
import com.entity.SongSheetEntity;
import com.service.AdminloginService;
import com.service.PlayRecoredsService;
import com.service.SongListService;
import com.service.SongSheetService;
import com.service.impl.SongListServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class PlayRecoredsController {
    @Autowired
    private SongListService songListService;
    @Autowired
    private PlayRecoredsService playRecoredsService;
    @Autowired
    private AdminloginService adminloginService;
    @Autowired
    private SongSheetService songSheetService;

    @RequestMapping("/playpages")
    public String playRecoreds(HttpServletRequest request){
        int id = Integer.parseInt(request.getParameter("slid"));
        playRecoredsService.playRecoredsTx(id);
        return "fe/playpages/playpages";

    }
}
