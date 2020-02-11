package com.controller.loginandregister;

import com.entity.AdminloginAndRegisterEntity;
import com.entity.UserLoginAndRegisterEntity;
import com.service.AdminLoginAndRegisterService;
import com.service.UserLoginAndRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class UaserLoginController {
    @Autowired
    private UserLoginAndRegisterService service;
    @PostMapping("/fe/login")
    public String login(String username,String password,String vc, HttpSession session){
        String vcFromSession = session.getAttribute("vc").toString();
        List<UserLoginAndRegisterEntity> result = service.getAll();
        for (UserLoginAndRegisterEntity userLoginAndRegisterEntity : result) {
            if(userLoginAndRegisterEntity.getUlname().equalsIgnoreCase(username)&&
                    userLoginAndRegisterEntity.getUlpassword().equals(password)&&
                    vc.equalsIgnoreCase(vcFromSession)){
                session.setAttribute("username",username);
                return "redirect:/index";
            }
        }
        return "redirect:fe/login";
    }
}
