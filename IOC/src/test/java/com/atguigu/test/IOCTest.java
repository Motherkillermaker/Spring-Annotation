package com.atguigu.test;

import com.atguigu.config.Mainconfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author CJYong
 * @create 2021-10-26 13:56
 */
public class IOCTest {

    AnnotationConfigApplicationContext applicationContext =
            new AnnotationConfigApplicationContext(Mainconfig.class);

    private void printBeans(AnnotationConfigApplicationContext applicationContext){
        String[] names = applicationContext.getBeanDefinitionNames();
        for (String name:names) {
            System.out.println(name);
        }
    }

    @Test
    public void test2(){
        // 获取 IOC 容器的所有对象
        printBeans(applicationContext);

    }

    @Test
    public void test1(){
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(Mainconfig.class);
        String[] names = applicationContext.getBeanDefinitionNames();
        for (String name:names) {
            System.out.println(name);
        }

    }
}
