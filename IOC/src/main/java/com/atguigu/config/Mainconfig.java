package com.atguigu.config;

import com.atguigu.bean.Color;
import com.atguigu.bean.ColorFactorBean;
import com.atguigu.bean.Person;
import com.atguigu.condition.MyImportBeanDefinitionRegistrar;
import com.atguigu.condition.MyImportSelector;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 * @author CJYong
 * @create 2021-10-26 13:37
 */

@Configuration
@Import({Color.class, MyImportSelector.class, MyImportBeanDefinitionRegistrar.class})  //快速导入组件，ID 默认为全类名
@ComponentScan(value = "com.atguigu",excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class, Service.class})
})
//  配置类等同于以前的配置文件(代码 -> 配置 -> 约定（注解）)
//  excludeFilters 以数组的方式选择排除哪些组件
//  includeFilters 以数组的方式选择只需要哪些组件
public class Mainconfig {

    @Bean  //给容器中注入一个Bean(类型为返回值类型，id默认为方法名)
    public Person person(){
        return new Person("lisi",20);
    }

    @Bean
    public ColorFactorBean colorFactorBean(){
        return new ColorFactorBean();
    }
}
