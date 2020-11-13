package com.jason.lee.servlet;

import org.apache.commons.lang3.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author huanli9
 * @description
 * @date 2020/11/12 16:26
 */
@WebServlet(name = "CookieServlet")
public class CookieServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //记住用户名、密码
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        String rm = request.getParameter("rememberMe");
        if (StringUtils.isNotBlank(rm)) {
            Cookie cookieName = new Cookie("name", name);
            Cookie cookiePwd = new Cookie("password", password);

            // 设置有效时间7天
            cookieName.setMaxAge(60 * 60 * 24 * 7);
            cookiePwd.setMaxAge(60 * 60 * 24 * 7);

            response.addCookie(cookieName);
            response.addCookie(cookiePwd);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取cookie
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            System.out.println(cookie.getName() + " : " + cookie.getValue());
        }

        // 创建自定义cookie
        Cookie cookie1 = new Cookie("name", "lee");
        Cookie cookie2 = new Cookie("age", "18");

        // 设置cookie有效路径
        cookie1.setPath(request.getContextPath() + "/cookie");

        // 设置cookie存活时间(秒)
        // time>0
        // time=0 不保存，立即失效
        // time<0 默认会话级别
        cookie2.setMaxAge(30);

        response.addCookie(cookie1);
        response.addCookie(cookie2);
    }
}
