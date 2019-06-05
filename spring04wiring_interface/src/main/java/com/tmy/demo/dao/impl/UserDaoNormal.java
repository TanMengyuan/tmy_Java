package com.tmy.demo.dao.impl;

import com.tmy.demo.dao.UserDao;
import org.springframework.stereotype.Component;

@Component
public class UserDaoNormal implements UserDao {
    public void add() {
        System.out.println("Adding user to Mysql...");
    }
}
