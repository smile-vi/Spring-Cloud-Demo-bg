package com.comfig.client.git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 马运动
 * @date 2020/4/9 16:05
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConfigClientGitApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientGitApplication.class,args);
    }
}
