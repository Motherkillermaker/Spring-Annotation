package com.atguigu.test;

import com.atguigu.tx.TxConfig;
import com.atguigu.tx.UserService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author CJYong
 * @create 2021-10-28 20:40
 */
public class IOCTxTest {

    AnnotationConfigApplicationContext applicationContext =
            new AnnotationConfigApplicationContext(TxConfig.class);

    @Test
    public void test1(){
        UserService userService = applicationContext.getBean(UserService.class);
        userService.insertUser();
    }
}
