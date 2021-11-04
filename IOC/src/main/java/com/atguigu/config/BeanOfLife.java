package com.atguigu.config;

/**自定义Bean的初始化和销毁方法
 * @author CJYong
 * @create 2021-10-26 20:39
 */

import com.atguigu.bean.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 1.通过@Bean 指定初始化方法和销毁方法
 *              单实例：初始化在对象创建完成并赋值，调用初始化方法  销毁在IOC容器关闭的时候
 *              多实例：初始化在对象调用完成并赋值，调用初始化方法  不会销毁（需要自己手动销毁）
 * 2.
 * 3.
 * 4.
 */
@Configuration
public class BeanOfLife {

    @Bean(initMethod = "init",destroyMethod = "destroy")
    public Car car(){
        return new Car();
    }
}
