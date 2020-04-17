package com.cloud.zuul.config;

import com.cloud.zuul.filter.TokenFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author 马运动
 * @date 2020/4/17 19:16
 */
@Component
public class TokenConfiguration {
    @Bean
    public TokenFilter tokenFilter(){
        return new TokenFilter();
    }
}
