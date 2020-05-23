package com.wang.serviceimpl;

import com.wang.dao.UserDao;
import com.wang.daoimpl.UserDaoImpl;
import com.wang.daoimpl.UserDaoOracleImpl;
import com.wang.service.UserService;

/**
 * @author wanggy5
 * @date 2020/5/23 19:05
 */
public class UserServiceImpl implements UserService {

//    private UserDao userDao = new UserDaoOracleImpl();

    private UserDao userDao;
    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }
    /**
     * 获取人员信息
     */
    @Override
    public void getUser() {
        userDao.getUser();
    }
}
