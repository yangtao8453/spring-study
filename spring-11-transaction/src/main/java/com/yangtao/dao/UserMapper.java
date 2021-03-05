package com.yangtao.dao;

import com.yangtao.pojo.User;

import java.util.List;

/**
 * @author yangtao
 * @description
 * @create 2021-03-02 14:02
 */
public interface UserMapper {
    public List<User> selectUser();

    //添加一个用户
    public int addUser(User user);

    //删除一个用户
    public int deleteUser(int id);

}
