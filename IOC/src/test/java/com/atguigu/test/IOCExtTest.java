package com.atguigu.test;

import com.atguigu.ext.ExtConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author CJYong
 * @create 2021-10-29 12:33
 */
public class IOCExtTest {
    AnnotationConfigApplicationContext applicationContext =
            new AnnotationConfigApplicationContext(ExtConfig.class);

    @Test
    public void test1(){

    }
}
