package com.controller.fe;

import com.entity.SongListEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping("/index")
    public String index(){
        return "fe/index";
    }
    @RequestMapping("/admin/index")
    public String index2(){
        return "be/index";
    }
    @RequestMapping("/login")
    public String login(){
        return "be/loginandregister/login";
    }
    @RequestMapping("/search")
    public String search(){
        return "fe/search";
    }


}
