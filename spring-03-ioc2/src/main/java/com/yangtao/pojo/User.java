package com.yangtao.pojo;

/**
 * @author yangtao
 * @description 测试Spring使用无参构造对象
 * @create 2021-02-27 19:06
 */
public class User {

    private String name;

    public User() {
        System.out.println("调用了无参构造方法！");
    }

    public User(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("name = " + name);
    }

}
