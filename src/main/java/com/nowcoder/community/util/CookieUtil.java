package com.nowcoder.community.util;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author bo
 * @date Created in 20:22 2020/3/2
 * @description
 **/
public class CookieUtil {
    public static String getValue(HttpServletRequest request,String name){
        if (request==null || name ==null){
            throw new IllegalArgumentException("参数为空");
        }
        Cookie[] cookies =request.getCookies();
        if (cookies!=null){
            for (Cookie cookie :cookies){
                if (cookie.getName().equals(name)){
                    return cookie.getValue();
                }
            }
        }
        return null;
    }
}
