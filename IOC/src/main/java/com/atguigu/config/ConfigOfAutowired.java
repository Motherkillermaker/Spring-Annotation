package com.atguigu.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author CJYong
 * @create 2021-10-27 9:49
 */
@Configuration
@ComponentScan({"com.atguigu.service","com.atguigu.dao","com.atguigu.controller"})
public class ConfigOfAutowired {


}
