package com.yangtao.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @author yangtao
 * @description
 * @create 2021-03-01 18:21
 */
public class AfterLog implements AfterReturningAdvice {
    //o：返回值
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("执行了 " + method.getName() + " 方法，返回结果为：" + 0);
    }
}
