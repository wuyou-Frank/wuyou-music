package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
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
}
