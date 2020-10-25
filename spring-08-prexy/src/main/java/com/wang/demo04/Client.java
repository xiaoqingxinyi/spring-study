package com.wang.demo04;

import com.wang.demo02.UserService;
import com.wang.demo02.UserServiceImpl;

/**
 * @author wanggy5
 * @date 2020/10/25 20:11
 */
public class Client {

    public static void main(String[] args) {
        //真实角色
        UserServiceImpl userServiceImpl= new UserServiceImpl();

        ProxyInvocationHandler pro = new ProxyInvocationHandler();

        pro.setTarget(userServiceImpl);

        UserService userService = (UserService)pro.getProxy();

        userService.delete();
    }

}
