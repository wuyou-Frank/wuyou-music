package com.verificationcode;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

public class VerificationCode {
    public void getRandcode(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("image/png");
        //创建一个图片,相当于拿了一张纸
        BufferedImage image = new BufferedImage(100, 40, BufferedImage.TYPE_INT_RGB);
        //相当于有了一个画笔
        Graphics2D graphics = image.createGraphics();
        //画了一个矩形
        graphics.setColor(Color.yellow);

        graphics.fillRect(0, 0, 200, 40);
        //改变画笔的颜色,以便画一个红色的字
        graphics.setColor(Color.red);
        graphics.setFont(new Font("Times New Roman", Font.PLAIN,20));
        //画一个字符串
        String vcString = generateValidateCode();
        request.getSession().setAttribute("vc", vcString);
        graphics.drawString(vcString, 25, 25);
        //图片就会以png的格式经过响应流响应给浏览器
        ImageIO.write(image, "png", response.getOutputStream());
    }
    private char[] chars = {'a','b','c','d','e'};
    private String generateValidateCode() {
        Random random = new Random();
        String validateCodeString= "";

        for(int i=0;i<4;i++) {
            int result = random.nextInt(chars.length) ;//0-4的整数
            char c = chars[result];
            validateCodeString+=c;
        }

        return validateCodeString;
    }
}
