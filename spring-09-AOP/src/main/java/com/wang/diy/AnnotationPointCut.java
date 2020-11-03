package com.wang.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @author wanggy5
 * @date 2020/11/2 11:00
 */
@Aspect //标注这个类是个切面
public class AnnotationPointCut {

    @Before("execution(* com.wang.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("====方法之前=======");
    }

    @After("execution(* com.wang.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("====方法之后=======");
    }

    //在环绕增强中，给定个参数，代表我们要获取处理的切入点
    @Around("execution(* com.wang.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("====环绕之前=======");
        //执行方法
        Object proceed = jp.proceed();
        System.out.println("===环绕后=====");

//        Signature signature = jp.getSignature();//打印签名
//        System.out.println("signature == " + signature);

    }
}
