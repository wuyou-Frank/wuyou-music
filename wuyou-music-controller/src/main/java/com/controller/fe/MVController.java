package com.controller.fe;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MVController {
    @RequestMapping("/mv")
    public String mv(){
        return "fe/MV";
    }
}
