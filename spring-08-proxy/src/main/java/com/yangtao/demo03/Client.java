package com.yangtao.demo03;

/**
 * @author yangtao
 * @description
 * @create 2021-03-01 15:56
 */
public class Client {
    public static void main(String[] args) {
        //真实角色
        Host host = new Host();
        //生成代理类
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        //通过调用程序处理角色来处理调用的接口对象
        pih.setTarget(host);
        //获得代理类（动态生成）
        Rent proxy = (Rent) pih.getProxy();

        proxy.rent();

    }
}
