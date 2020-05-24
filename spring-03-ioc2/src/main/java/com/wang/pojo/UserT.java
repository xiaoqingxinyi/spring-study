package com.wang.pojo;

/**
 * @author wanggy5
 * @date 2020/5/24 1:35
 */
public class UserT {
    private String name;

    //无参构造函数
//    public User(){
//        System.out.println("User的无参构造");
//    }
    //有参构造函数
    public UserT(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("name=" + name);
    }
}
