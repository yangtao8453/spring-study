package com.yangtao.demo04;

import com.yangtao.demo02.UserService;
import com.yangtao.demo02.UserServiceImpl;

/**
 * @author yangtao
 * @description
 * @create 2021-03-01 16:14
 */
public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setTarget(userService);
        UserService proxy = (UserService) pih.getProxy();
        proxy.update();
    }
}
