package com.wang.demo02;

/**
 * @author wanggy5
 * @date 2020/10/25 19:42
 */
public class Client {
    public static void main(String[] args) {
        UserServiceImpl userServiceImpl = new UserServiceImpl();
//        userServiceImpl.add();

        UserServiceProxy userServiceProxy = new UserServiceProxy();

        userServiceProxy.setUserService(userServiceImpl);

        userServiceProxy.add();
    }
}
