package com.atguigu.test;

import com.atguigu.config.Mainconfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author CJYong
 * @create 2021-10-26 20:44
 */
public class IOCTestLife {

    AnnotationConfigApplicationContext applicationContext =
            new AnnotationConfigApplicationContext(Mainconfig.class);

    private void printBeans(AnnotationConfigApplicationContext applicationContext){
        String[] names = applicationContext.getBeanDefinitionNames();
        for (String name:names) {
            System.out.println(name);
        }
    }

    @Test
    public void test1(){
        applicationContext.close();
    }
}
