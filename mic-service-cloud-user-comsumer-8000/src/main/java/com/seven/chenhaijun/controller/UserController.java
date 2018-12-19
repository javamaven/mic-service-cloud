package com.seven.chenhaijun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by ${chenhaijun} on 2018/11/23.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private String USER_URL_PREFIX = "http://MIC-USER-PROVIDER";

    private String DEPT_URL_PREFIX = "http://MIC-DEPT-PROVIDER";

    @Autowired
    RestTemplate restTemplate;


    @RequestMapping("/getUser")
    public Object get(int page,int rows){
        return restTemplate.getForObject(USER_URL_PREFIX + "/user/get?page="+page+"&rows="+rows, String.class);
    }

    @RequestMapping("/getDept")
    public Object getDept(){
        return restTemplate.getForObject(DEPT_URL_PREFIX + "/dept/get", String.class);
    }

    @RequestMapping("/getSession")
    public Object getSesson(){
        return restTemplate.getForObject(USER_URL_PREFIX + "/testSession/get", String.class);
    }
}
