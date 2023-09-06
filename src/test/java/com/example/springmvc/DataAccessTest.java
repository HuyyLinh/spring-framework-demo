package com.example.springmvc;

import com.example.springmvc.service.Foo;
import com.example.springmvc.service.FooService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DataAccessTest {
    @Test
    void testConfig(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
        FooService fooService = ctx.getBean(FooService.class);
        fooService.insertFoo(new Foo());
        fooService.updateFoo(new Foo());
    }
}
