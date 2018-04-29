package com.dubbo.test;

import com.dubbo.common.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String []args){
        ClassPathXmlApplicationContext xat=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService us=(UserService) xat.getBean("userService");
        String s=us.getName("write a frist dubbo");
        System.out.println(s);
    }

}
