package com.wang.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author wanggy5
 * @date 2020/10/25 20:32
 */
public class log implements MethodBeforeAdvice {


    //method :要执行的目标对象的方法
    //Object :参数
    //target :目标对象
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass().getName() + "的" + method.getName() + "被执行了。");
    }
}
