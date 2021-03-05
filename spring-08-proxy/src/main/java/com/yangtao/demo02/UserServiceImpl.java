package com.yangtao.demo02;

/**
 * @author yangtao
 * @description
 * @create 2021-02-28 23:57
 */
public class UserServiceImpl implements UserService {

    @Override
    public void add() {
        System.out.println("增加用户");
    }

    @Override
    public void delete() {
        System.out.println("删除用户");
    }

    @Override
    public void query() {
        System.out.println("查找用户");
    }

    @Override
    public void update() {
        System.out.println("修改用户");
    }
}
