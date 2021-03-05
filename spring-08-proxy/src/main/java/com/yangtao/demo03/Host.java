package com.yangtao.demo03;

/**
 * @author yangtao
 * @description 房东：真实角色
 * @create 2021-02-28 23:23
 */
public class Host implements Rent {

    @Override
    public void rent() {
        System.out.println("房东要出租房子！");
    }
}
