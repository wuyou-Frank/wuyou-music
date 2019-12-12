package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class IndexController {
    @RequestMapping("/index")
    public String index(){
        return "fe/index";
    }
    @RequestMapping("/admin/index")
    public String index2(){
        return "/be/index";
    }
    @GetMapping("/login")
    public String login(){
        return "be/loginandregister/login";
    }
    @GetMapping("/register")
    public String register(){
        return "be/loginandregister/register";
    }

    @RequestMapping("/search")
    public String search(){
        return "fe/search";
    }

    @RequestMapping("/classification/index")
    public String classificationIndex(){
        return "be/classification/list";
    }
    @RequestMapping("/community/index")
    public String community(){
        return "be/community/list";
    }


}
