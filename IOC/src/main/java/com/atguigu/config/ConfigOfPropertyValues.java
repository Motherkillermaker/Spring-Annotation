package com.atguigu.config;

import com.atguigu.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author CJYong
 * @create 2021-10-27 9:29
 */

@Configuration
public class ConfigOfPropertyValues {

    @Bean
    public Person person(){
        return new Person();
    }

}
