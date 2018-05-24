package com.jwell;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer   //表明是一个服务注册中心
public class JplatEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(JplatEurekaServerApplication.class, args);
    }
}
