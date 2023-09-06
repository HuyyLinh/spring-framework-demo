package com.example.springmvc.aop.exampleclass;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class NotVeryUsefulAspect {
//    @Before("execution(public void newAccount())")
//    public void BeforeNewAccount() {
//        System.out.println("@Before Advice - Executing the @Before advice ");
//    }

    @Before("execution(void com.example.springmvc.aop.exampleclass.StudentAccountDao.newAccount()))")
    public void BeforeStudentNewAccount() {
        System.out.println("@Before Advice - com.example.springmvc.aop.exampleclass.StudentAccountDao.newAccount() ");
    }

    @After("execution(int com.example.springmvc.aop.*.StudentAccountDao.newAccount()))")
    public void BeforeAllStudentAccount(JoinPoint joinPoint) {
        System.out.println("@After Advice - " + joinPoint.toString());
    }


}
