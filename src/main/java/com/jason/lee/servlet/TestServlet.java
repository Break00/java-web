package com.jason.lee.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author huanli9
 * @description
 * @date 2020/11/10 17:23
 */
public class TestServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("doPost");
        // 获取请求参数
        String name = request.getParameter("name");
        System.out.println("name: " + name);
        // 获取项目虚拟路径
        String contextPath = request.getContextPath();
        System.out.println("contextPath: " + contextPath);
        // 转发  【客户端请求一次】  地址栏不变，可以访问WEB-INF下的资源
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("success.html");
        requestDispatcher.forward(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取响应流
        PrintWriter writer = response.getWriter();
        //响应
//        writer.write("<h1>login success</h1>");
        // 重定向  【客户端请求两次】  地址栏变化
        response.sendRedirect("success.html");

    }
}
