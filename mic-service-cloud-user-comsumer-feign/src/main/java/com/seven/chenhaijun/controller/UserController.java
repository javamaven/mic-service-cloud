package com.seven.chenhaijun.controller;

import com.seven.chenhaijun.config.UserService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Enumeration;

/**
 * Created by ${chenhaijun} on 2018/11/23.
 */
@RestController
@RequestMapping("/user")
@RefreshScope
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/index")
    public String getIndex(HttpServletRequest request){
        return "index";
    }

    @RequestMapping("/getUser")
    public Object get(int id){
        return userService.get(id);
    }

    @RequestMapping("/list")
    public Object get(int page,int rows){
        return userService.findList(page,rows);
    }

    @RequestMapping("/getSession")
    public String get(HttpServletRequest request){
        HttpSession session = request.getSession();
        session.setAttribute("haha","nihaohadfss");
        System.out.println("======================================================================="+session.getId());
        //设置用户名
        userService.getUserSession();
        session = request.getSession();
        System.out.println("-----------------"+session.getAttribute("username"));
        return session.getId();
    }

    @RequestMapping("/getUserName")
    public String getSession (HttpServletRequest request){
        HttpSession session = request.getSession();
        System.out.println("======================================================================="+session.getId());
        Enumeration e = session.getAttributeNames();
        while(e.hasMoreElements()   )   {
            String   sessionName   =   (String)e.nextElement();
            System.out.println(sessionName + ":" +  session.getAttribute(sessionName));
        }
        userService.getUserSession();
        String username = (String)session.getAttribute("username");
        if(StringUtils.isEmpty(username)){
            username = "testSessionRedis|" + System.currentTimeMillis();
            session.setAttribute("username", username);
        }
        return ".....";
    }

    @RequestMapping("/afterGetSession")
    public String getSetAfter(HttpServletRequest request){
        HttpSession session = request.getSession();
        return session.getAttribute("username").toString();
    }

    @ResponseBody
    @RequestMapping("/testFeign/{key}")
    public String testFeign(@PathVariable String key, HttpServletRequest request) {
        return userService.getSession(key);
    }

    @ResponseBody
    @RequestMapping("/setFeign")
    public String settFeign(String key,String value,HttpServletRequest request ) {
        request.getSession().setAttribute("ooo","fdgdg");
        return userService.setSession(key,value);
    }
}
