package com.tmy.demo.web;

import com.tmy.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class UserController {

    @Autowired
    @Qualifier("normal")
    private UserService userService;

    public void add(){
        userService.add();
    }
}
