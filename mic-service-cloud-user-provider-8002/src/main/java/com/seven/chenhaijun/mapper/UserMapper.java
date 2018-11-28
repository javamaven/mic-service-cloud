package com.seven.chenhaijun.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.seven.chenhaijun.entity.UserDto;

import java.util.List;

/**
 * Created by ${chenhaijun} on 2018/11/23.
 */
public interface UserMapper extends BaseMapper<UserDto>{

    List<UserDto> findAll(Page page);

}
