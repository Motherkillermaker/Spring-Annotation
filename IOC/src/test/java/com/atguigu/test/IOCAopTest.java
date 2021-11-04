package com.atguigu.test;

import com.atguigu.aop.MathCalculator;
import com.atguigu.config.ConfigOfAop;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author CJYong
 * @create 2021-10-28 10:52
 */
public class IOCAopTest {
    AnnotationConfigApplicationContext applicationContext =
            new AnnotationConfigApplicationContext(ConfigOfAop.class);

    @Test
    public void test1(){
        //需要从容器中获取相应的对象
        MathCalculator mathCalculator = applicationContext.getBean(MathCalculator.class);

        mathCalculator.div(103,113);
    }
}
