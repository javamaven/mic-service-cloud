package com.seven.chenhaijun.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.seven.chenhaijun.service.IUserService;
import com.seven.chenhaijun.entity.User;
import com.seven.chenhaijun.entity.UserDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    @HystrixCommand(fallbackMethod = "getFallBackUser")
    public UserDto get(@RequestParam(value = "id") Integer id){
        if(id == 100){
            throw  new RuntimeException("超出用户权限");
        }
        User user = userService.getUser(id);
        UserDto result = new UserDto();
        if(user!=null){
            BeanUtils.copyProperties(user,result);
        }
        return result;
    }


    public UserDto getFallBackUser(Integer id){
        UserDto dto = new UserDto();
        dto.setId(0L);
        dto.setName("系统故障，默认值返回");
        return dto;
    }

}
