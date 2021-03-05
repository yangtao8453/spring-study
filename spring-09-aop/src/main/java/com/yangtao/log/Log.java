package com.yangtao.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author yangtao
 * @description
 * @create 2021-03-01 18:12
 */
public class Log implements MethodBeforeAdvice {

    //method：要执行的目标对象的方法
    //objects：参数
    //o：目标对象
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println(o.getClass().getName() + " 的 " + method.getName() + " 方法被执行了！");
    }
}
