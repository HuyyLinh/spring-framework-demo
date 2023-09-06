package com.example.springmvc;

import com.example.springmvc.aop.AppConfig;
import com.example.springmvc.aop.exampleclass.StudentAccountDao;
import com.example.springmvc.aop.exampleclass.UserAccountDao;
import com.example.springmvc.aop.exampleclass.exampleclass2.StudentAccountDao2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AopTests {
    AnnotationConfigApplicationContext context;

    @BeforeEach
    void setContext() {
        context = new AnnotationConfigApplicationContext(AppConfig.class);
    }

    @Test
    void beforeTest() {
        StudentAccountDao studentAccountDao = context.getBean(StudentAccountDao.class);
        UserAccountDao userAccountDao = context.getBean(UserAccountDao.class);
        StudentAccountDao2 studentAccountDao2 = context.getBean(StudentAccountDao2.class);
        userAccountDao.newAccount();
        studentAccountDao.newAccount();
        studentAccountDao2.newAccount();
        context.close();
    }


}
