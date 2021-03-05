package com.yangtao.demo01;

/**
 * @author yangtao
 * @description 代理
 * @create 2021-02-28 23:25
 */
public class Proxy implements Rent {
    private Host host;

    public Proxy(){
    }

    public Proxy(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        seeHouse();
        host.rent();
        hetong();
        fare();
    }

    //房东不能做，中介能做的事
    public void seeHouse(){
        System.out.println("中介带你看房！");
    }

    public void fare(){
        System.out.println("收中介费");
    }

    public void hetong(){
        System.out.println("签租借合同");
    }
}
