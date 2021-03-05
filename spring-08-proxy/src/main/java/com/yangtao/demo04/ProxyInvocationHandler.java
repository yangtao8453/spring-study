package com.yangtao.demo04;

import com.yangtao.demo03.Rent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author yangtao
 * @description 自动生成代理的类（工具类）
 * @create 2021-03-01 15:46
 */
public class ProxyInvocationHandler implements InvocationHandler {

    //被代理的接口
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    //生成得到代理类，固定代码，只需要修改代理类的接口
    public Object getProxy(){
        //代理类的加载器
        //代理类的接口
        //InvocationHandler
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    //处理代理实例，并返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log(method.getName());
        //动态代理的本质就是使用反射机制实现
        Object result = method.invoke(target, args);
        return result;
    }

    public void log(String msg){
        System.out.println("【日志】 执行了 " + msg + " 方法");
    }

}
