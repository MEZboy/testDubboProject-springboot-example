package com.example.demo;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.service.SayHelloService;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootDubboExampleConsumerApplication.class)
public class SpringbootDubboExampleConsumerApplicationTests {

    @Resource
    private SayHelloService sayHelloService;

    @Test
    public void testSayHello() {
        String sayHello = sayHelloService.sayHello("world");
        log.info("test sayHelloService.sayHello(\"world\") = {}", sayHello);
        Assert.assertEquals(sayHello, "hello, world");
    }
}