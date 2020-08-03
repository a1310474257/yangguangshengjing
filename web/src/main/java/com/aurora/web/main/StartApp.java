package com.aurora.web.main;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 作者：jun
 * 创建时间：2020.5月.29日
 */
@SpringBootApplication(scanBasePackages = "com.aurora")
@MapperScan("com.aurora.web.dao")
public class   StartApp {
    public static void main(String[] args) {
        SpringApplication.run(StartApp.class,args);
    }

}
