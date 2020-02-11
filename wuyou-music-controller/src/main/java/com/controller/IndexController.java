package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class IndexController {
    @RequestMapping("/index")
    public String index(){
        return "fe/index";
    }
    @RequestMapping("/search")
    public String search(){
        return "fe/search";
    }
    @GetMapping("/fe/login")
    public String userLogin(){
        return "fe/loginandregister/login";
    }
    @GetMapping("/fe/register")
    public String userRegister(){
        return "fe/loginandregister/register";
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
    @RequestMapping("/classification/index")
    public String classificationIndex(){
        return "be/classification/list";
    }
    @RequestMapping("/community/index")
    public String community(){
        return "be/community/list";
    }
    @RequestMapping("/songsheet/index")
    public String songsheet(){
        return "be/songsheet/list";
    }

}
