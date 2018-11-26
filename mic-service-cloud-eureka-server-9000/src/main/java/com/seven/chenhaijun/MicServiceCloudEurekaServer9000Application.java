package com.seven.chenhaijun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicServiceCloudEurekaServer9000Application {

	public static void main(String[] args) {
		SpringApplication.run(MicServiceCloudEurekaServer9000Application.class, args);
	}
}
