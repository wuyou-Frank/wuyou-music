package com.controller.be;

import com.entity.ClassificationEntity;
import com.service.ClassificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/be/classification")
public class ClassificationController {
    @Autowired
    private ClassificationService classificationService;

    @RequestMapping("/select")
    @ResponseBody
    public List<ClassificationEntity> select(
            @RequestParam(value = "pageNum",required = false,defaultValue = "1")int pageNum,
            @RequestParam(value = "pageSize",required = false,defaultValue = "10")int pageSize){
        return classificationService.getAllPage(pageNum,pageSize);
    }
}
