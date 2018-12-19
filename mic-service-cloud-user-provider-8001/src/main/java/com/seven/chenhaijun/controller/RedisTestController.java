package com.seven.chenhaijun.controller;

import org.apache.commons.lang.StringUtils;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Enumeration;

/**
 * Created by ${chenhaijun} on 2018/12/10.
 */
@RestController
@RequestMapping("/testSession")
@RefreshScope
public class RedisTestController {


    @RequestMapping("/get")
    public String getUserSession(HttpServletRequest request){
        HttpSession session = request.getSession();
        System.out.println(request.getHeader("cookie"));
        System.out.println("======================================================"+session.getId());
        String username = (String)session.getAttribute("username");
        if(StringUtils.isEmpty(username)){
            username = "testSessionRedis|" + System.currentTimeMillis();
            session.setAttribute("username", username);
        }
        System.out.println("=======================================================================");
        Enumeration e = session.getAttributeNames();
        while(e.hasMoreElements()   )   {
            String   sessionName   =   (String)e.nextElement();
            System.out.println(sessionName + ":" +  session.getAttribute(sessionName));
        }
        return username +"-"+8001;
    }

    @ResponseBody
    @RequestMapping("/setSession/{key}/{value}")
    public String setSession(@PathVariable String key , @PathVariable String value,
                             HttpServletRequest request){
        System.out.println("------"+request.getRequestedSessionId()+"----------------");
        request.getSession().setAttribute(key,value);
        Enumeration<String> headers = request.getHeaderNames();
        while (headers.hasMoreElements()){
            String name = headers.nextElement();
            System.out.println(name + ":"+ request.getHeader(name));
        }
        System.out.println(request.getSession().getId());
        return request.getSession().getId();
    }

    @ResponseBody
    @RequestMapping("/getSession/{key}")
    public String getSession(@PathVariable String key ,HttpServletRequest request){
        return request.getSession().getAttribute(key) + "---- sessionId:" + request.getSession().getId() ;
    }

}
