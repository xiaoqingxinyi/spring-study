package com.wang.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author wanggy5
 * @date 2020/6/3 23:44
 */
//注解的意思，这个类被spring接管了 component
@Component
public class User {
    private String name;

    public String getName() {
        return name;
    }

    @Value("hehe")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}

