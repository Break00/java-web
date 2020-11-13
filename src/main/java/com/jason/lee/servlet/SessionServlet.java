package com.jason.lee.servlet;

import org.apache.commons.lang3.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author huanli9
 * @description
 * @date 2020/11/13 10:35
 */
@WebServlet(name = "SessionServlet")
public class SessionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        System.out.println(session.getId());

        //持久化Session （持久化Cookie实现）
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            if (StringUtils.equals("JSESSIONID", cookie.getName())) {
                // 设置Cookie存活时间
                cookie.setMaxAge(30 * 60);
                response.addCookie(cookie);
                break;
            }
        }
        //设置Session非活动时间（秒）
        // time>0
        // time<=0 永不失效
        session.setMaxInactiveInterval(30);
        // 立即失效
        // session.invalidate();
    }
}
