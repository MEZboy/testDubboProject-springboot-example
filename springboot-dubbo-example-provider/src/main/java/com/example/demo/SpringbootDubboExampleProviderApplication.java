package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:dubbo-provider.xml"})
public class SpringbootDubboExampleProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDubboExampleProviderApplication.class, args);
        // 若没有引入spring-boot-starter-web依赖，则需要执行System.in.read();让其阻塞。
    }
}