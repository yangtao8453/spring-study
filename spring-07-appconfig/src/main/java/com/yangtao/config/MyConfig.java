package com.yangtao.config;

import com.yangtao.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author yangtao
 * @description
 * @create 2021-02-28 21:04
 */

@Configuration  //这个也会被Spring托管，注册到容器中，加入注解后代表这个类是一个配置类，相当于 ApplicationContext.xml
@ComponentScan("com.yangtao.pojo")     //扫描，使这个包下的注解生效
@Import(MyConfig2.class)    //导入其他配置
public class MyConfig {

    //注册一个bean，相当于ApplicationContext.xml中的bean标签
    //方法的名字相当于 bean的id属性
    //返回值相当于 bean 的class属性
    @Bean
    public User getUser(){
        return new User();
    }

}
