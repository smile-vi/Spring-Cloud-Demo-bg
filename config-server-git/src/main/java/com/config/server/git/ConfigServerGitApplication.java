package com.config.server.git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author 马运动
 * @date 2020/4/9 14:41
 */
@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class ConfigServerGitApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerGitApplication.class,args);
    }
}
