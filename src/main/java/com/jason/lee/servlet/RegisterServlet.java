package com.jason.lee.servlet;

import org.apache.commons.lang3.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author huanli9
 * @description
 * @date 2020/11/10 20:45
 */
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 乱码问题
        request.setCharacterEncoding("UTF-8");
        String name = request.getParameter("name");
        if (StringUtils.equals(name, "lee")) {
            response.sendRedirect(request.getContextPath() + "/project/register.html");
        } else {
            request.getRequestDispatcher("project/register_success.html").forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
