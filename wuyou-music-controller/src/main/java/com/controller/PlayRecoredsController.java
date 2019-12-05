package com.controller;

import com.entity.PlayRecoredsEntity;
import com.service.PlayRecoredsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class PlayRecoredsController {
    @Autowired
    private PlayRecoredsService playRecoredsService;

    @RequestMapping("/playpages")
    public String playRecoreds(HttpServletRequest request){
        int id = Integer.parseInt(request.getParameter("slid"));
        playRecoredsService.playRecoredsTx(id);
        return "fe/playpages/playpages";
    }
    @RequestMapping("/playrecoreds/select")
    @ResponseBody
    public List<PlayRecoredsEntity> select(
            @RequestParam(value = "pageNum",defaultValue = "1",required = false) int pageNum,
            @RequestParam(value = "pageSize",defaultValue = "3",required = false)int pageSize){
        List<PlayRecoredsEntity> result = playRecoredsService.getAll(pageNum,pageSize);
        System.out.println("result = " + result);
        return result;
    }


}
