package com.jason.lee.servlet;


import javax.servlet.ServletException;
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
public class ReSubmitServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取session域和隐藏域中的uuid
        HttpSession session = request.getSession();
        Object uuid1 = session.getAttribute("uuid");
        String uuid2 = request.getParameter("uuid");

        if (uuid1 != null && uuid1.toString().equals(uuid2)) {
            System.out.println("表单提交");
            session.removeAttribute("uuid");
        }
        System.out.println("结束");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
