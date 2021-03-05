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
}
