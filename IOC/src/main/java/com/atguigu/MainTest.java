package com.atguigu;

import com.atguigu.bean.ColorFactorBean;
import com.atguigu.bean.Person;
import com.atguigu.config.Mainconfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.plaf.SpinnerUI;

/** 配置并生成 IOC 容器
 * @author CJYong
 * @create 2021-10-26 13:34
 */
public class MainTest {
    public static void main(String[] args) {

        //配置的方式使用IOC容器对象
        ClassPathXmlApplicationContext ioc =
                new ClassPathXmlApplicationContext("beans.xml");
        Person person = (Person) ioc.getBean("person");
        System.out.println(person);

        //注解的方式使用IOC容器对象
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(Mainconfig.class);
        Person bean = applicationContext.getBean(Person.class);
        System.out.println(bean);

    }
}
