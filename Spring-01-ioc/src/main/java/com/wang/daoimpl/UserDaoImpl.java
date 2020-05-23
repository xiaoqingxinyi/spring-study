package com.wang.daoimpl;

import com.wang.dao.UserDao;

/**
 * @author wanggy5
 * @date 2020/5/23 19:03
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("默认获取用户的数据。");
    }
}
