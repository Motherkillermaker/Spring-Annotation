package com.atguigu.ext;

import com.atguigu.bean.Blue;
import com.atguigu.bean.Car;
import com.atguigu.bean.Yellow;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author CJYong
 * @create 2021-10-29 12:23
 */

@ComponentScan("com.atguigu.ext")
@Configuration
public class ExtConfig {

    @Bean
    public Car car(){
        return new Car();
    }

}
