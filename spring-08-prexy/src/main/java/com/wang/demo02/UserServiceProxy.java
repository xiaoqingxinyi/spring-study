package com.wang.demo02;

/**
 * @author wanggy5
 * @date 2020/10/25 19:44
 */
public class UserServiceProxy implements UserService{

    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void add() {
        System.out.println("使用了add方法");
        userService.add();
    }

    @Override
    public void delete() {
        log("add");
        userService.delete();
    }

    @Override
    public void update() {
        userService.update();
    }

    @Override
    public void select() {
        userService.select();
    }

    //日志方法
    public void log(String msg){
        System.out.println("使用了" + msg + "方法。");
    }
}
