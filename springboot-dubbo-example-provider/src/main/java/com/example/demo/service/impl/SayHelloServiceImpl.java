package com.example.demo.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.service.SayHelloService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class SayHelloServiceImpl implements SayHelloService {
    @Override
    public String sayHello(String name) {
        log.info("call SayHelloService.sayHell(name:{})", name);
        return String.format("hello, %s", name);
    }
}