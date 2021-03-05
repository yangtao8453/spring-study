package com.yangtao.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author yangtao
 * @description
 * @create 2021-02-28 20:25
 */

//等价于 <bean id="user" class="com.yangtao.pojo.User"/>
@Component
@Scope("singleton")
public class User {

    @Value("yangtao")
    public String name;
}
