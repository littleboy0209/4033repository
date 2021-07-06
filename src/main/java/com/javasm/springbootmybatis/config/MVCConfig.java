package com.javasm.springbootmybatis.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author：ZhangChunYang
 * @Version：1.0
 * @Date：2021/7/1-20:46
 * @Since:jdk1.8
 * @Description:TODO
 */
@Configuration
public class MVCConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addRedirectViewController("/","login.html");
    }
}
