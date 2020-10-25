package com.wang.diy;

/**
 * @author wanggy5
 * @date 2020/10/25 20:57
 */
public class DivPointCut {

    public void before(){
        System.out.println("======方法执行前==========");
    }

    public void after(){
        System.out.println("======方法执行后==========");
    }
}
