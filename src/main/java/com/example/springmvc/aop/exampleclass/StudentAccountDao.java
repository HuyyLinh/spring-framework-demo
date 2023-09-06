package com.example.springmvc.aop.exampleclass;

import org.springframework.stereotype.Component;

@Component
public class StudentAccountDao {
    public int newAccount() {
        System.out.println(getClass());
        return 1;
    }

}
