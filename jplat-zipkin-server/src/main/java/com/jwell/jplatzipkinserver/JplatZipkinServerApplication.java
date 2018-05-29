package com.jwell.jplatzipkinserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
//@EnableZipkinServer
@EnableZipkinStreamServer
@EnableEurekaClient
public class JplatZipkinServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(JplatZipkinServerApplication.class, args);
    }
}
