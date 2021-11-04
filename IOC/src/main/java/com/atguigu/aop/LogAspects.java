package com.atguigu.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

/**
 * @author CJYong
 * @create 2021-10-28 10:25
 */

@Aspect
//业务增强类
public class LogAspects {

    //抽取切入点表达式
    @Pointcut("execution(public int com.atguigu.aop.MathCalculator.* (..))")
    public void pointCut(){

    }

    //前置通知(切入点表达式)
    // JoinPoint 参数如果要使用必须写在参数的第一位
    @Before("execution(public int com.atguigu.aop.MathCalculator.* (..))")
    public void logStart(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        System.out.println(joinPoint.getSignature().getName() +  "运行中，参数列表为："
                + Arrays.asList(args));
    }

    @After("pointCut()")
    //后置通知
    public void logEnd(JoinPoint joinPoint){
        System.out.println(joinPoint.getSignature().getName() +  "运行完毕");
    }

    //返回通知
    @AfterReturning(value = "pointCut()",returning = "result")
    public void logReturn(JoinPoint joinPoint,Object result){
        System.out.println(joinPoint.getSignature().getName() +  "正常返回，运行结果为：" + result );
    }

    //异常通知
    @AfterThrowing(value = "pointCut()",throwing = "e")
    public void logException(JoinPoint joinPoint,Exception e){
        System.out.println(joinPoint.getSignature().getName() +  "异常，异常信息为：" + e);
    }

}
