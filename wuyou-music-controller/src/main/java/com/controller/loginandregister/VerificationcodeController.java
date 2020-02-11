package com.controller.loginandregister;

import com.verificationcode.VerificationCode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class VerificationcodeController {
    @RequestMapping("/vc")
    public void checkCode(HttpServletRequest request, HttpServletResponse response) throws IOException {
        VerificationCode verificationCode = new VerificationCode();
        verificationCode.getRandcode(request,response);
    }
}
