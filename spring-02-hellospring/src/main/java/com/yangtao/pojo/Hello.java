package com.yangtao.pojo;

/**
 * @author yangtao
 * @description
 * @create 2021-02-26 16:11
 */
public class Hello {
    private String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "str='" + str + '\'' +
                '}';
    }
}
