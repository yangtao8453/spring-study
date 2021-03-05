package com.yangtao.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author yangtao
 * @description
 * @create 2021-03-01 22:09
 */
@Component
@Aspect //标注这是一个切面类
public class AnnotationPorinCut {

    @Before("execution(* com.yangtao.service.UserServiceImpl.*(..))")   //注意不要导到junit的包，参数指定切入点
    public void before(){
        System.out.println("=====方法执行前=====");
    }

    @After("execution(* com.yangtao.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("=====方法执行后=====");
    }

    //环绕增强中，我们可以给定一个参数，代表我们要获取处理切入的点
    @Around("execution(* com.yangtao.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint pj) throws Throwable {
        System.out.println("环绕前");
        Signature signature = pj.getSignature();    //获取签名，即执行中的方法
        System.out.println(signature);
        Object proceed = pj.proceed();  //执行方法
        System.out.println("环绕后");
    }

}
