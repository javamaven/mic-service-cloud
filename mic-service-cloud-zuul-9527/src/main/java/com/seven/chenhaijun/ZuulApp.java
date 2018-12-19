package com.seven.chenhaijun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by ${chenhaijun} on 2018/11/30.
 */
@SpringBootApplication
@EnableZuulProxy
public class ZuulApp {

    public static void main(String args[]){
        SpringApplication.run(ZuulApp.class,args);
    }

}
