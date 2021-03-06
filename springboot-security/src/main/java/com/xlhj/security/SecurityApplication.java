package com.xlhj.security;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName SecurityApplication
 * @Description 启动类
 * @Author liucaijing
 * @Date 2020/10/17 19:54
 * @Version 1.0
 */
@SpringBootApplication
@MapperScan(basePackages = "com.xlhj.*.mapper")
public class SecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecurityApplication.class, args);
    }
}
