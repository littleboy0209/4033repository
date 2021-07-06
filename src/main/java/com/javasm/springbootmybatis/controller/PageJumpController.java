package com.javasm.springbootmybatis.controller;

import com.javasm.springbootmybatis.utils.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * @Author：ZhangChunYang
 * @Version：1.0
 * @Date：2021/7/1-20:42
 * @Since:jdk1.8
 * @Description:TODO
 */
@Controller
public class PageJumpController {
//    @GetMapping("/")
//    public String pageJump(){
//        return "redirect:login.html";
//    }

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private EmailService emailService;

    /**
     *
     * @param email 接收前台传过来的email
     * @return
     */
    @GetMapping("getEmailCode")
    public String getEmailCode(String email) throws InterruptedException {

        for (int i = 0; i < 100; i++) {
            emailService.sendEmail(email);
        }

        //验证码失效时间 5分钟
        stringRedisTemplate.opsForValue().set(email+1,"666666",5,TimeUnit.MINUTES);

        return "success";
    }
}
