package com.seven.chenhaijun.Service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.seven.chenhaijun.entity.UserDto;

import java.util.List;

/**
 * Created by ${chenhaijun} on 2018/11/23.
 */
public interface IUserService {
    List<UserDto> findAllUser(Page page);

}
