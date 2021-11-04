package com.atguigu.condition;

import com.atguigu.bean.RainBow;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author CJYong
 * @create 2021-10-26 20:11
 */

public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    // annotationMetadata: 当前类的注解信息
    // beanDefinitionRegistry： beanDefinition注册类
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry beanDefinitionRegistry) {
        boolean definition1 = beanDefinitionRegistry.containsBeanDefinition("com.atguigu.bean.Blue");
        boolean definition2 = beanDefinitionRegistry.containsBeanDefinition("com.atguigu.bean.Yellow");
        if (definition1 && definition2){
            //指定Bean的定义信息 (Bean的类型，作用域等)
            RootBeanDefinition beanDefinition = new RootBeanDefinition(RainBow.class);
            //注册一个Bean并指定 Bean 名
            beanDefinitionRegistry.registerBeanDefinition("rainBow",beanDefinition);
        }
    }
}
