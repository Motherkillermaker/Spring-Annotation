package com.atguigu.test;

import com.atguigu.bean.Person;
import com.atguigu.config.ConfigOfPropertyValues;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author CJYong
 * @create 2021-10-27 9:31
 */
public class IOCPropertyValues {

    AnnotationConfigApplicationContext applicationContext =
            new AnnotationConfigApplicationContext(ConfigOfPropertyValues.class);

    private void printBeans(AnnotationConfigApplicationContext applicationContext){
        String[] names = applicationContext.getBeanDefinitionNames();
        for (String name:names) {
            System.out.println(name);
        }
    }
    @Test
    public void test1(){
        //1.创建IOC容器
        printBeans(applicationContext);
        System.out.println("===================");
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);

        //2.关闭容器
        applicationContext.close();
    }
}
