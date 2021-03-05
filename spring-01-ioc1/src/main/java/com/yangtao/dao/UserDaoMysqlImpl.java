package com.yangtao.dao;

/**
 * @author yangtao
 * @description
 * @create 2021-02-26 11:33
 */
public class UserDaoMysqlImpl implements UserDao{

    @Override
    public void getUser() {
        System.out.println("Mysql获取用户数据");
    }
}
