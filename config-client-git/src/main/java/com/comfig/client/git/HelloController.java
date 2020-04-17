package com.comfig.client.git;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 马运动
 * @date 2020/4/9 16:14
 */
@RestController
@RefreshScope
public class HelloController {
    @Value("${neo.hello}")
    private String profile;

    @GetMapping("/info")
    public String hello(){
        return this.profile;
    }

}
