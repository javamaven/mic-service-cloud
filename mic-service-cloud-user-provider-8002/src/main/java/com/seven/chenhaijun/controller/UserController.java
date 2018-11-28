package com.seven.chenhaijun.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.seven.chenhaijun.Service.IUserService;
import com.seven.chenhaijun.entity.User;
import com.seven.chenhaijun.entity.UserDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

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
    public UserDto get(Integer id){
        User user = userService.getUser(id);
        UserDto result = new UserDto();
        if(user!=null){
            BeanUtils.copyProperties(user,result);
        }
        return result;
    }

    @RequestMapping("/list")
    @ResponseBody
    public Object get(int page,int rows){
        log.info("----------8002----------");
        Page params = new Page();
        params.setPages(page);
        params.setSize(rows);
        List<UserDto> dtos = new ArrayList<UserDto>();
        List<User> users = userService.findAllUser(params);
        for(User user : users){
            UserDto dto = new UserDto();
            if(user != null){
                BeanUtils.copyProperties(user,dto);
            }
            dtos.add(dto);
        }
        return dtos;
    }

}
