package com.wang.daoimpl;

import com.wang.dao.UserDao;

/**
 * @author wanggy5
 * @date 2020/5/23 19:42
 */
public class UserDaoMysqlImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("默认获取mysql用户的数据。");
    }
}
