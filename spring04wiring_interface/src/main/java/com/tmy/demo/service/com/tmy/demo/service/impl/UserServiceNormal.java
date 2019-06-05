package com.tmy.demo.service.com.tmy.demo.service.impl;

import com.tmy.demo.dao.UserDao;
import com.tmy.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("normal")
public class UserServiceNormal implements UserService {

    @Autowired
    private UserDao userDao;

    public void add(){
        System.out.println("Adding user...");
        userDao.add();
    }
}
