package com.wang.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.lang.Nullable;

import javax.annotation.Resource;

/**
 * @author wanggy5
 * @date 2020/5/24 23:57
 */
public class People {
    //如果显式的定义了Autowired的required属性为false，说明这个对象可以为null，否则不允许。
//    @Autowired
//    @Qualifier(value = "cat222")
    @Resource(name = "cat")
    private Cat cat;
    @Autowired
    private Dog dog;

    private String name;

    public Cat getCat() {
        return cat;
    }
    @Autowired
    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Dog getDog() {
        return dog;
    }

    @Autowired
    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "People{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", name='" + name + '\'' +
                '}';
    }
}
