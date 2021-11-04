package com.atguigu.bean;

/**
 * @author CJYong
 * @create 2021-10-26 20:41
 */
public class Car {

    public Car(){
        System.out.println("car constructor ....");
    }

    public void init(){
        System.out.println("car init....");
    }

    public void destroy(){
        System.out.println("car destroy");
    }
}
