package com.jason.lee.servlet;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

/**
 * @author huanli9
 * @description
 * @date 2020/11/10 15:41
 */
public class HelloServlet implements Servlet {

    //Servlet的配置对象
    private ServletConfig servletConfig;

    @Override
    public void init(ServletConfig config) throws ServletException {
        this.servletConfig = config;
        System.out.println("HelloServlet init");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /**
     * 处理请求
     *
     * @param req
     * @param res
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("HelloServlet service");
        String servletParam = servletConfig.getInitParameter("servletParam");
        System.out.println("servletConfig.getServletName: " + servletConfig.getServletName());
        System.out.println("servletConfig.getInitParameter: " + servletParam);

        //Servlet的上下文对象
        ServletContext servletContext = servletConfig.getServletContext();
        String contextParam = servletContext.getInitParameter("contextParam");
        System.out.println("servletContext.getInitParameter：" + contextParam);
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("HelloServlet destroy");
    }
}
