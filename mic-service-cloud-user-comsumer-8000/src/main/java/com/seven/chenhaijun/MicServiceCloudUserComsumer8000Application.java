package com.seven.chenhaijun;

import com.seven.RuleConfig.MyRuleConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
//指定某个微服务使用特定的路由规则  可参考原生的路由规则 自己写路由规则
@RibbonClient(name="MIC-USER-PROVIDER",configuration=MyRuleConfig.class)
public class MicServiceCloudUserComsumer8000Application {
	public static void main(String[] args) {
		SpringApplication.run(MicServiceCloudUserComsumer8000Application.class, args);
	}
}
