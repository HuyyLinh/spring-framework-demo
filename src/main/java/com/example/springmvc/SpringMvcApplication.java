package com.example.springmvc;

import com.example.springmvc.aop.AppConfig;
import com.example.springmvc.aop.exampleclass.UserAccountDao;
import com.example.springmvc.service.Foo;
import com.example.springmvc.service.FooService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@Controller
public class SpringMvcApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
        FooService fooService = ctx.getBean(FooService.class);
        fooService.insertFoo(new Foo());
        fooService.updateFoo(new Foo());
    }

}
