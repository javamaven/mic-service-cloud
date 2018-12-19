package com.seven.chenhaijun.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.seven.chenhaijun.service.IUserService;
import com.seven.chenhaijun.entity.UserDto;
import com.seven.chenhaijun.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ${chenhaijun} on 2018/11/23.
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserDto> findAllUser(Page page) {
        return userMapper.findAll(page);
    }
}
