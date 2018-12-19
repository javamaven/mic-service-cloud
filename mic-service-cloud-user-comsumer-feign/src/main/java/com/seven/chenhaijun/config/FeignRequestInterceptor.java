package com.seven.chenhaijun.config;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

/**
 * Created by ${chenhaijun} on 2018/12/11.
 */
@Component
public class FeignRequestInterceptor implements RequestInterceptor {

    @Autowired
    private HttpServletRequest request;

    @Value("${spring.application.name}")
    private String serviceName;

    @Override
    public void apply(RequestTemplate requestTemplate) {
        requestTemplate.header("from-service", "serviceName");
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        request = attributes.getRequest();
        Enumeration<String> headerNames = request.getHeaderNames();
        if(headerNames!=null){
            while (headerNames.hasMoreElements()){
                String name = headerNames.nextElement();
                String values = request.getHeader(name);
                requestTemplate.header(name,values);
            }
        }
        requestTemplate.header("SESSIONID",request.getSession().getId());

/*        if(null != attributes){
            HttpServletRequest request = attributes.getRequest();
            String sessionId = request.getHeader("SESSIONID");
            if(!StringUtils.isEmpty(sessionId)){
                requestTemplate.header("SESSIONID", sessionId);
            }
        }*/
    }
}