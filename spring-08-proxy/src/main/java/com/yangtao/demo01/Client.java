package com.yangtao.demo01;

/**
 * @author yangtao
 * @description 客户
 * @create 2021-02-28 23:25
 */
public class Client {
    public static void main(String[] args) {
        //房东要租房子
        Host host = new Host();
        //代理，中介帮房东租房子，代理角色一般有一些附属操作
        Proxy proxy = new Proxy(host);
        //客户不用面对房东，直接找中介租房
        proxy.rent();
    }
}
