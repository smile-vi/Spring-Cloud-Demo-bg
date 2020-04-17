package com.producer.fegin.controller;

import com.producer.fegin.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 马运动
 * @date 2020/4/7 20:51
 */
@RestController
public class HelloController {
    @Autowired
    HelloRemote helloRemote;
    @GetMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name){
        return helloRemote.hello(name + "!feign");
    }
}
