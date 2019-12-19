package com.controller.fe;

import com.entity.LanguageEntity;
import com.entity.LanguagesingerEntity;
import com.entity.SingerEntity;
import com.github.pagehelper.PageInfo;
import com.service.LanguageService;
import com.service.LanguagesingerService;
import com.service.SingerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class SingerController {
    @Autowired
    private SingerService singerService;
    @Autowired
    private LanguagesingerService languagesingerService;
    @Autowired
    private LanguageService languageService;
    @RequestMapping("/discover/singer")
    public String select(@RequestParam(value = "pageNum",required = false,defaultValue = "1")int pageNum,
                         @RequestParam(value = "pageSize",required = false,defaultValue = "10")int pageSize,
                         Model model){
        List<SingerEntity> singer = singerService.getAll(pageNum,pageSize);
        List<LanguageEntity> language = languageService.getAll();
        List<LanguagesingerEntity> languagesinger = languagesingerService.getAll();
        PageInfo pageInfo = new PageInfo(singer);
        model.addAttribute("language",language);
        model.addAttribute("languagesinger",languagesinger);
        model.addAttribute("singer",pageInfo);
        return "fe/singer/discoversinger";
    }
    @RequestMapping("/singer")
    public String singer(@RequestParam(value = "pageNum",required = false,defaultValue = "1")int pageNum,
                         @RequestParam(value = "pageSize",required = false,defaultValue = "10")int pageSize,
                         @RequestParam(value = "name",required = false) String name,
                         Model model){
        SingerEntity singerEntity = singerService.getByName2(name);
        List<SingerEntity> result = singerService.getByName(pageNum,pageSize,name);
        PageInfo pageInfo = new PageInfo(result);
        model.addAttribute("singerEntity",singerEntity);
        model.addAttribute("result",pageInfo);
        return "fe/singer/singer";
    }
}
