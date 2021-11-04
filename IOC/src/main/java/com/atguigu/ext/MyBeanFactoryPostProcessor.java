package com.atguigu.ext;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

/**
 * @author CJYong
 * @create 2021-10-29 12:26
 */
@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println("MyBeanFactoryPostProcessor的postProcessBeanFactory方法执行了...");
        int count = configurableListableBeanFactory.getBeanDefinitionCount();
        System.out.println("一共有" + count + "个beans");
        String[] names = configurableListableBeanFactory.getBeanDefinitionNames();
        for (String name: names) {
            System.out.println(name);
        }
    }
}
