package com.javasm.springbootmybatis.config;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author：ZhangChunYang
 * @Version：1.0
 * @Date：2021/7/6-15:26
 * @Since:jdk1.8
 * @Description:TODO
 */
@RestController
public class AdminController {
    @GetMapping("git")
    public String git(){
        return "git";
    }
}
