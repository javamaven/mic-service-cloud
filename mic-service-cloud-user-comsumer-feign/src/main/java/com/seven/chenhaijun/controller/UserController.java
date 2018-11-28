package com.seven.chenhaijun.controller;

import com.seven.chenhaijun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ${chenhaijun} on 2018/11/23.
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/getUser")
    public Object get(int page,int rows){
        return userService.findUserList(page,rows);
    }

}
