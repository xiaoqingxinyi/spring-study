package com.wang.demo03;

/**
 * @author wanggy5
 * @date 2020/10/25 19:12
 */
public class Host implements Rent {

    @Override
    public void rent() {
        System.out.println("房东要出租房子");
    }
}
