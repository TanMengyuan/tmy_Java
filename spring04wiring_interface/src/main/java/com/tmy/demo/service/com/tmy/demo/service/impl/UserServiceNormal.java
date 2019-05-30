package com.tmy.demo.service.com.tmy.demo.service.impl;

import com.tmy.demo.service.UserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("normal")
public class UserServiceNormal implements UserService {

    public void add(){
        System.out.println("Adding user...");
    }
}
