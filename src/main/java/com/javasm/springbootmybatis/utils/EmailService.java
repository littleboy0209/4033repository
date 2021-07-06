package com.javasm.springbootmybatis.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * @Author：ZhangChunYang
 * @Version：1.0
 * @Date：2021/7/1-21:50
 * @Since:jdk1.8
 * @Description:TODO
 */
@Component
public class EmailService {

    @Autowired
    private JavaMailSender javaMailSender;

    @Async//异步,默认线程8个
    public void sendEmail(String email) throws InterruptedException {

//        异步,默认线程8个
        System.out.println(Thread.currentThread().getName());
        TimeUnit.SECONDS.sleep(3);

//        //发送邮件过程耗时,使用异步处理
//        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
////        随机验证码
////        UUID uuid = UUID.randomUUID();
////        String code = uuid.toString().substring(0, 6);
//        //发送的主题
//        simpleMailMessage.setSubject("登录验证");
//        //发送的内容
//        simpleMailMessage.setText("您的验证码为:666666");
//        //由谁发送
//        simpleMailMessage.setFrom("尚马教育<zhangchunyang0209@163.com>");
//        //发送到
//        simpleMailMessage.setTo(email);
//        javaMailSender.send(simpleMailMessage);
    }
}
