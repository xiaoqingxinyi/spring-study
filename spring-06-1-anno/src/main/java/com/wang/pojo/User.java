package com.wang.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author wanggy5
 * @date 2020/6/3 23:07
 */
@Component
@Scope("singleton")
public class User {

    @Value("cccc")
    public String name;
}
