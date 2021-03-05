package com.yangtao.demo02;

/**
 * @author yangtao
 * @description
 * @create 2021-03-01 0:08
 */
public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        UserServiceProxy userServiceProxy = new UserServiceProxy();

        userServiceProxy.setUserService(userService);

        userServiceProxy.delete();
        userServiceProxy.query();
    }
}
