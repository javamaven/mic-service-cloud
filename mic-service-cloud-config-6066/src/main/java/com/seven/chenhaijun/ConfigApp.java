package com.seven.chenhaijun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by ${chenhaijun} on 2018/11/30.
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigApp {
    public static void main(String args[]){
        SpringApplication.run(ConfigApp.class,args);
    }
}
