package com.controller.be;

import com.entity.AdminloginAndRegisterEntity;
import com.service.AdminloginAndRegisterService;
import com.verificationcode.VerificationCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.io.IOException;
import java.util.List;

@Controller
public class AdminLoginAndRegisterController {
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

    @RequestMapping("/vc")
    public void checkCode(HttpServletRequest request, HttpServletResponse response) throws IOException {
        VerificationCode verificationCode = new VerificationCode();
        verificationCode.getRandcode(request,response);
    }


    @PostMapping("/register")
    public ModelAndView insert(@Valid AdminloginAndRegisterEntity entity, BindingResult bindingResult){
        ModelAndView mav = new ModelAndView();
        if(bindingResult.hasErrors()){
            List<FieldError> errors = bindingResult.getFieldErrors();
            for(FieldError error:errors){
                mav.addObject(error.getField(),error.getDefaultMessage() );
            }
            mav.addObject("entity",entity);
            mav.setViewName("redirect:register");
        }else{
//            List<AdminloginAndRegisterEntity> result = service.getAll();
//            for (AdminloginAndRegisterEntity adminloginAndRegisterEntity : result) {
//                if (adminloginAndRegisterEntity.getAlname() == entity.getAlname()){
//                    mav.setViewName("redirect:register");
//                }
//            }
            service.insert(entity);
            mav.setViewName("redirect:login");
        }
        return mav;
    }
}
