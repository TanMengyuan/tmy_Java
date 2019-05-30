package com.tmy.demo.service.com.tmy.demo.service.impl;

import com.tmy.demo.service.UserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
@Qualifier("festival")
public class UserServiceFestival implements UserService {

    public void add() {
        System.out.println("User get some discount...");
    }
}
