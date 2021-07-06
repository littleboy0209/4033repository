package com.javasm.springbootmybatis.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author：ZhangChunYang
 * @Version：1.0
 * @Date：2021/7/1-12:00
 * @Since:jdk1.8
 * @Description:TODO
 */
@RestController
public class LogController {
    Logger logger = LoggerFactory.getLogger(LogController.class);

    @GetMapping("log")
    public String log(){
        logger.trace("trace");
        logger.debug("debug");

        //默认级别为info,下面三个会打印
        logger.info("info");
        logger.warn("warn");
        logger.error("error");
        return "log";
    }
}
