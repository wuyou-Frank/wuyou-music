package com.controller.loginandregister;

import com.entity.UserLoginAndRegisterEntity;
import com.service.UserLoginAndRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
public class UserRegisterController {
    @Autowired
    private UserLoginAndRegisterService service;
    @PostMapping("/fe/register")
    public ModelAndView insert(@Valid UserLoginAndRegisterEntity entity, BindingResult bindingResult){
        ModelAndView mav = new ModelAndView();
        if(bindingResult.hasErrors()){
            List<FieldError> errors = bindingResult.getFieldErrors();
            for(FieldError error:errors){
                mav.addObject(error.getField(),error.getDefaultMessage() );
            }
            mav.addObject("entity",entity);
            mav.setViewName("redirect:fe/register");
        }else{
            service.insert(entity);
            mav.setViewName("redirect:fe/login");
        }
        return mav;
    }
}
