package com.example.springmvc;

import com.example.springmvc.aop.AppConfig;
import com.example.springmvc.aop.exampleclass.UserAccountDao;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@Controller
public class SpringMvcApplication {

    public static void main(String[] args) {
        System.out.println("Hi Linh!");
    }

}
