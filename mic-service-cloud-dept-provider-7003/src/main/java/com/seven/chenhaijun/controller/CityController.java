package com.seven.chenhaijun.controller;


import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 市级信息 前端控制器
 * </p>
 *
 * @author chenhaijun
 * @since 2018-11-23
 */
@RestController
@RequestMapping("/dept")
public class CityController {

    @RequestMapping("get")
    public Object getDept(){
        return "7003";
    }

}
