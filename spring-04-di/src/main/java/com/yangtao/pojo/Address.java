package com.yangtao.pojo;

/**
 * @author yangtao
 * @description
 * @create 2021-02-28 10:32
 */
public class Address {
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                '}';
    }
}
