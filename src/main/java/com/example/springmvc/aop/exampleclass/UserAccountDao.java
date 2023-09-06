package com.example.springmvc.aop.exampleclass;

import org.apache.catalina.User;
import org.springframework.stereotype.Component;
@Component
public class UserAccountDao {

    public void newAccount() {
        System.out.println(getClass());
    }
}