package com.seven.chenhaijun.controller;

import com.seven.chenhaijun.Service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by ${chenhaijun} on 2018/11/23.
 */
@RequestMapping("/user")
@Controller
@Slf4j
public class UserController {

    @Resource
    IUserService userService;

    @RequestMapping("/get")
    @ResponseBody
    public Object get(int page,int rows){
        return "8003";
    }

}
