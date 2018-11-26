package com.seven.chenhaijun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicServiceCloudEurekaServer9001Application {

	public static void main(String[] args) {
		SpringApplication.run(MicServiceCloudEurekaServer9001Application.class, args);
	}
}
