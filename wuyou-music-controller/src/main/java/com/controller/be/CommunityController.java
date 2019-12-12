package com.controller.be;

import com.entity.CommunityEntity;
import com.service.CommunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/be/community")
public class CommunityController {
    @Autowired
    private CommunityService communityService;
    @RequestMapping("/select")
    @ResponseBody
    public List<CommunityEntity> select(){
        return communityService.getAll();
    }
    @RequestMapping("/delete")
    public String delete(HttpServletRequest request){
        int id = Integer.parseInt(request.getParameter("cmid"));
        communityService.delete(id);
        return "redirect:/community/index";
    }
    @RequestMapping("/insert")
    public String insert(CommunityEntity entity){
        communityService.insert(entity);
        return "redirect:/community/index";
    }
    @RequestMapping("/update")
    public String update(CommunityEntity entity){
        communityService.update(entity);
        return "redirect:/community/index";
    }
}
