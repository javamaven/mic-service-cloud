package com.seven.chenhaijun.user.service.impl;

import com.seven.chenhaijun.user.entity.User;
import com.seven.chenhaijun.user.mapper.UserMapper;
import com.seven.chenhaijun.user.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author chenhaijun
 * @since 2018-11-23
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
