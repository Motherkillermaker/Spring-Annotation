package com.atguigu.springmvc;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author CJYong
 * @create 2021-10-29 15:52
 */
public class MySpringMVC extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    //获取根容器的配置类 （spring的配置文件）；父容器
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    //获取Web容器的配置类；（springMVC配置文件）；子容器
    protected Class<?>[] getServletConfigClasses() {
        return new Class[0];
    }

    @Override
    //获取dispatcherservlet的映射信息
    //      /: 表示拦截所有请求（包括静态资源，但不包括 *.jsp页面）
    //     /*： 表示拦截所有请求；jsp页面由Tomcat的jsp引擎解析
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
