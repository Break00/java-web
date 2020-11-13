package com.jason.lee.filter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author huanli9
 * @description
 * @date 2020/11/13 17:13
 */
public class HelloFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("HelloFilter");
        req.setAttribute("filter","filter");
        chain.doFilter(req, resp);
        System.out.println("HelloFilter");
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
