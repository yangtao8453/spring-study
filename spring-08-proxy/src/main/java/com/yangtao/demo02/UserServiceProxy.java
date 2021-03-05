package com.yangtao.demo02;

/**
 * @author yangtao
 * @description
 * @create 2021-03-01 0:01
 */
public class UserServiceProxy {

    private UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService){
        this.userService = userService;
    }

    public void add() {
        log("add");
        userService.add();
    }

    public void delete() {
        log("delete");
        userService.delete();
    }

    public void query() {
        log("query");
        userService.query();
    }

    public void update() {
        log("update");
        userService.update();
    }

    //日志输出方法
    public void log(String msg){
        System.out.println("【log】 " + msg + " 方法");
    }
}
