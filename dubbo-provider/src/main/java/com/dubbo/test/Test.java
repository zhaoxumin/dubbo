package com.dubbo.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String []args){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        ctx.start();
    }

}
