package com.seven.chenhaijun.fallback;

import com.seven.chenhaijun.entity.UserDto;
import com.seven.chenhaijun.service.UserService;
import feign.hystrix.FallbackFactory;

import java.util.List;

/**
 * Created by ${chenhaijun} on 2018/11/28.
 */
//@Component
public class UserFallBackFactory implements FallbackFactory<UserService> {

    @Override
    public UserService create(Throwable cause) {
        return new UserService() {
            @Override
            public UserDto get(Integer id) {
                UserDto dto = new UserDto();
                dto.setId(0L);
                dto.setName("服务不可用，默认值返回");
                return dto;
            }

            @Override
            public List<UserDto> findList(int page, int rows) {
                return null;
            }

            @Override
            public String getUserSession() {
                return "";
            }
        };
    }
}
