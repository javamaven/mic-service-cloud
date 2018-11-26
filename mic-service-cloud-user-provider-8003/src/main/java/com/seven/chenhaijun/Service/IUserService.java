package com.seven.chenhaijun.Service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.seven.chenhaijun.entity.User;

import java.util.List;

/**
 * Created by ${chenhaijun} on 2018/11/23.
 */
public interface IUserService {
    List<User> findAllUser(Page page);

}
