package com.example.springmvc.aop.exampleclass.exampleclass2;

import org.springframework.stereotype.Component;

@Component
public class StudentAccountDao2 {
    public void newAccount() {
        System.out.println(getClass());
    }

}
