package com.jason.lee.filter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author huanli9
 * @description
 * @date 2020/11/13 21:00
 */
public class HttpFilterTest extends HttpFilter {
    @Override
    public void doFilter(HttpServletRequest req, HttpServletResponse resp, FilterChain chain) throws ServletException, IOException {
//        FilterConfig config = getFilterConfig();
//        System.out.println("FilterConfig: " + config);
//        System.out.println("HttpFilterTest");
        // 利用过滤器处理字符编码问题
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");
        chain.doFilter(req, resp);

    }
}
