package com.yangtao.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yangtao
 * @description
 * @create 2021-02-27 19:09
 */
public class Test {

    @org.junit.Test
    public void TestUser(){
        //测试Spring使用无参构造参数
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user1 = (User) context.getBean("user");
        user1.show();
    }

}
