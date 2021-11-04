package com.atguigu.test;

import com.atguigu.bean.Person;
import com.atguigu.config.ConfigOfAutowired;
import com.atguigu.config.ConfigOfPropertyValues;
import com.atguigu.service.BookService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author CJYong
 * @create 2021-10-27 9:54
 */
public class IOCTestAutowired {

    AnnotationConfigApplicationContext applicationContext =
            new AnnotationConfigApplicationContext(ConfigOfAutowired.class);

    private void printBeans(AnnotationConfigApplicationContext applicationContext){
        String[] names = applicationContext.getBeanDefinitionNames();
        for (String name:names) {
            System.out.println(name);
        }
    }
    @Test
    public void test1(){
        BookService bookService = applicationContext.getBean(BookService.class);
        System.out.println(bookService);
    }
}
