package com.jason.lee.listener;


import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 ** @author huanli9
 * @description
 * @date 2020/11/13 21:14
 */
public class ContextListener implements ServletContextListener{

    // Public constructor is required by servlet spec
    public ContextListener() {
    }

    // -------------------------------------------------------
    // ServletContextListener implementation
    // -------------------------------------------------------
    public void contextInitialized(ServletContextEvent sce) {
      /* This method is called when the servlet context is
         initialized(when the Web application is deployed). 
         You can initialize servlet context related data here.
      */
        System.out.println("ContextListener Initialized");
    }

    public void contextDestroyed(ServletContextEvent sce) {
      /* This method is invoked when the Servlet Context 
         (the Web application) is undeployed or 
         Application Server shuts down.
      */
        System.out.println("ContextListener Destroyed");
    }
}
