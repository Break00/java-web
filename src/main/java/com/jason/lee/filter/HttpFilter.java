package com.jason.lee.filter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author huanli9
 * @description
 * @date 2020/11/13 20:54
 */
public abstract class HttpFilter implements Filter {

    private FilterConfig filterConfig;

    public void init(FilterConfig config) throws ServletException {
        this.filterConfig = config;
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest)req;
        HttpServletResponse response = (HttpServletResponse)resp;
        doFilter(request,response,chain);
    }

    public abstract void doFilter(HttpServletRequest req, HttpServletResponse resp, FilterChain chain) throws ServletException,
            IOException;

    /**
     * 获取FilterConfig对象
     * @return
     */
    public FilterConfig getFilterConfig() {
        return filterConfig;
    }

    public void destroy() {
    }

}
