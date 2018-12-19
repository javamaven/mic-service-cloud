package com.seven.chenhaijun.service;

import com.seven.chenhaijun.entity.UserDto;
import com.seven.chenhaijun.fallback.UserFallBackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by ${chenhaijun} on 2018/11/27.
 */
@FeignClient(name = "MIC-USER-PROVIDER",fallbackFactory = UserFallBackFactory.class)
public interface UserService {

/*    @RequestMapping(value="/user/get",method = RequestMethod.GET)
    String findUserList(@RequestParam("page") int page, @RequestParam("rows") int rows);

    @RequestMapping(value="/user/test", method=RequestMethod.GET)
    Model test(@RequestParam("name") final String name, @RequestParam("age")  final int age);*/

/*    @RequestMapping(value="/user/save", method=RequestMethod.GET)
    public int save(@RequestBody final User user  ,@RequestParam("userId") String userId, @RequestParam("userTel") String userTel);*/

    @RequestMapping(value="/user/get",method = RequestMethod.GET)
    UserDto get(@RequestParam("id")Integer id);

    @RequestMapping(value="/user/list",method = RequestMethod.GET)
    List<UserDto> findList(@RequestParam("page") int page, @RequestParam("rows") int rows);

    @RequestMapping(value="/testSession/get",method = RequestMethod.GET)
    String getUserSession();

}
