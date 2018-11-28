package com.seven.chenhaijun.Service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.seven.chenhaijun.Service.IUserService;
import com.seven.chenhaijun.entity.User;
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
    public User getUser(Integer id) {
        return userMapper.selectById(id);
    }

    @Override
    public List<User> findAllUser(Page page) {
        return userMapper.findAll(page);
    }
}
