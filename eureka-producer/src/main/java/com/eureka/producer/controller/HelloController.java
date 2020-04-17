package com.eureka.producer.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author 马运动
 * @date 2020/4/7 16:06
 */
@RestController
public class HelloController {
    @Value("${server.port}")
    private Integer port;
    @GetMapping("hello")
    public String hello(@RequestParam String name){
        return "Hello, " + name + " 当前端口:" + port;
    }
}
