package com.atguigu.aop;

/**
 * @author CJYong
 * @create 2021-10-28 10:23
 */
public class MathCalculator {

    //业务逻辑类(主要功能)
    public int div(int i, int j){
        System.out.println("MathCalculator div 方法被调用 ...");
        return i / j;
    }
}
