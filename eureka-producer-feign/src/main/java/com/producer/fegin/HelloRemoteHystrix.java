package com.producer.fegin;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 马运动
 * @date 2020/4/8 19:14
 */
@Component
public class HelloRemoteHystrix implements HelloRemote{
    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "恭喜你，成功进入hystrix模式！！！";
    }
}
