package com.wang.config;

import com.wang.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wanggy5
 * @date 2020/6/3 23:45
 */
//这个也会被spring容器托管，注册到容器中，他也是个component
//一个配置类，类似beans.xml
@Configuration
public class MyConfig {

    //注册一个bean，就相当于我们之前写的bean标签
    //这个方法的名字，就像当于bean标签中的id
    //这个方法的返回值，就相当于bean标签中的class属性
    //return就是返回要注入bean的对象
    @Bean
    public User getUser(){
        return new User();
    }
}
