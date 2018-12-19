package com.seven.chenhaijun.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * Created by ${chenhaijun} on 2018/12/10.
 */
@Configuration
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 100)
public class RedisSessionConfig {
}
