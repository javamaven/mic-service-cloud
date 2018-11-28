package com.seven.chenhaijun.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by ${chenhaijun} on 2018/11/27.
 */
@FeignClient(name = "MIC-USER-PROVIDER")
public interface UserService {

    @RequestMapping(value="/user/get",method = RequestMethod.GET)
    String findUserList(@RequestParam("page") int page, @RequestParam("rows") int rows);

    @RequestMapping(value="/user/test", method=RequestMethod.GET)
    Model test(@RequestParam("name") final String name, @RequestParam("age")  final int age);

/*    @RequestMapping(value="/user/save", method=RequestMethod.GET)
    public int save(@RequestBody final User user  ,@RequestParam("userId") String userId, @RequestParam("userTel") String userTel);*/

}
