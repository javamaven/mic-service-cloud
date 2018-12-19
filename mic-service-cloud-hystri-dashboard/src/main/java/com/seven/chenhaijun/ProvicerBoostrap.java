package com.seven.chenhaijun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * Created by ${chenhaijun} on 2018/11/22.
 */
@SpringBootApplication
@EnableHystrixDashboard
public class ProvicerBoostrap {

    public static void  main(String args[]){
        SpringApplication.run(ProvicerBoostrap.class,args);
    }

}
