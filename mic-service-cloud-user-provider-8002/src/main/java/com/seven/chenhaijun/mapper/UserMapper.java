package com.seven.chenhaijun.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.seven.chenhaijun.entity.User;

import java.util.List;

/**
 * Created by ${chenhaijun} on 2018/11/23.
 */
public interface UserMapper extends BaseMapper<User>{

    List<User> findAll(Page page);

}
