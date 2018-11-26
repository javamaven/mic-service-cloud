package com.seven.chenhaijun;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by ${chenhaijun} on 2018/11/22.
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan(basePackages = "com.seven.chenhaijun.mapper")
public class ProvicerBoostrap {

    public static void  main(String args[]){
        SpringApplication.run(ProvicerBoostrap.class,args);
    }

}
