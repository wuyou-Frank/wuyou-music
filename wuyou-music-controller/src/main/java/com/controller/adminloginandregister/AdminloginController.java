package com.controller.adminloginandregister;

import com.entity.AdminloginAndRegisterEntity;
import com.service.AdminloginAndRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class AdminloginController {
    @Autowired
    private AdminloginAndRegisterService service;
    @PostMapping("/login")
    public String login(String username,String password,String vc, HttpSession session){
        String vcFromSession = session.getAttribute("vc").toString();
        List<AdminloginAndRegisterEntity> result = service.getAll();
        for (AdminloginAndRegisterEntity adminloginEntity : result) {
            if(adminloginEntity.getAlname().equalsIgnoreCase(username)&&
                    adminloginEntity.getAlpassword().equals(password)&&
                    vc.equalsIgnoreCase(vcFromSession)){
                session.setAttribute("username",username);
                return "redirect:/admin/index";
            }
        }
        return "redirect:login";
    }
}
