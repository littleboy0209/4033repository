package com.javasm.springbootmybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.concurrent.ThreadPoolExecutor;

@SpringBootApplication
@EnableTransactionManagement//开启事务
@MapperScan(basePackages = {"com.javasm.springbootmybatis.mapper"})
@EnableAsync//开启异步
public class SpringbootMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisApplication.class, args);
    }

    //    编写配置类设置连接池大小
    @Bean
    public ThreadPoolTaskExecutor threadPoolExecutor() {
        ThreadPoolTaskExecutor threadPoolTaskExecutor = new ThreadPoolTaskExecutor();
        threadPoolTaskExecutor.setCorePoolSize(20);
        threadPoolTaskExecutor.setMaxPoolSize(50);
        return threadPoolTaskExecutor;
    }

}
