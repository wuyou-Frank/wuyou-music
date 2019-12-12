package com.controller.be;

import com.entity.ClassificationEntity;
import com.service.ClassificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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

    @RequestMapping("/delete")
    public String delete(HttpServletRequest request){
        int id = Integer.parseInt(request.getParameter("cid"));
        classificationService.delete(id);
        return "redirect:/classification/index";
    }
    @RequestMapping("/insert")
    public String insert(ClassificationEntity entity){
        classificationService.insert(entity);
        return "redirect:/classification/index";
    }
    @RequestMapping("/update")
    public String update(ClassificationEntity entity){
        classificationService.update(entity);
        return "redirect:/classification/index";
    }
}
