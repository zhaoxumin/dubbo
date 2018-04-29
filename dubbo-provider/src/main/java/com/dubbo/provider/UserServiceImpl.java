package com.dubbo.provider;

import com.dubbo.common.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class UserServiceImpl implements UserService {

    @Override
    public String getName(String userId) {
        return "zhaoxumin"+userId;
    }

}
