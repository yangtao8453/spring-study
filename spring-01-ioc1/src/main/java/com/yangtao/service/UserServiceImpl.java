package com.yangtao.service;

import com.yangtao.dao.UserDao;
import com.yangtao.dao.UserDaoImpl;
import com.yangtao.dao.UserDaoOracleImpl;

/**
 * @author yangtao
 * @description
 * @create 2021-02-26 11:28
 */
public class UserServiceImpl implements UserService{

//    private UserDao userDao = new UserDaoOracleImpl();
    private UserDao userDao;

    //利用set进行动态实现值的注入
    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
