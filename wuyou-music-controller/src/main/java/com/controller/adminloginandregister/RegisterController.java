package com.controller.adminloginandregister;

import com.entity.AdminloginAndRegisterEntity;
import com.service.AdminloginAndRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
public class RegisterController {
    @Autowired
    private AdminloginAndRegisterService service;
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
