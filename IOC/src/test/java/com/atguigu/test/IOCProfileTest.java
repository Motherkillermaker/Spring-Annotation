package com.atguigu.test;

import com.atguigu.config.ConfigOfProfile;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

/**
 * @author CJYong
 * @create 2021-10-28 9:53
 */
public class IOCProfileTest {

    AnnotationConfigApplicationContext applicationContext =
            new AnnotationConfigApplicationContext();

    @Test
    public void test1(){
        //设置需要激活的环境
        applicationContext.getEnvironment().setDefaultProfiles("test");
        //注册配置类
        applicationContext.register(ConfigOfProfile.class);
        //启动刷新容器
        applicationContext.refresh();

        String[] namesForType = applicationContext.getBeanNamesForType(DataSource.class);
        for (String name: namesForType) {
            System.out.println(name);
        }
    }


}
