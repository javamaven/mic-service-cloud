package com.seven.RuleConfig;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by ${chenhaijun} on 2018/11/26.
 */

@Configuration
public class MyRuleConfig {

    @Bean
    public IRule myRule(){
        return new RandomRule();
    }

}
