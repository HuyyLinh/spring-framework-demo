package com.example.springmvc;

import com.example.springmvc.annotationconfig.MovieRecommender;
import com.example.springmvc.jpetstore.services.PetStoreServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootTest
class SpringMvcApplicationTests {
    ApplicationContext context;


    @BeforeEach
    void setContext() {
        context = new ClassPathXmlApplicationContext("services.xml", "daos.xml");
    }

    @Test
    void contextLoads() {
    }

    @Test
    void testApplicationContext() {
//      ApplicationContext context = new ClassPathXmlApplicationContext("services.xml", "daos.xml");
//      PetStoreServiceImpl petStoreService = (PetStoreServiceImpl) context.getBean("petStore");
        PetStoreServiceImpl petStoreService1 = context.getBean("petStore", PetStoreServiceImpl.class);
        System.out.println(petStoreService1.getAccountDao());
        System.out.println(petStoreService1.getItemDao());
        System.out.println(petStoreService1.name);
    }

    @Test
    void testStaticFactoryMethod() {
        System.out.println(context.getBean("clientService"));
    }

    @Test
    void testConstructorArg(){
        System.out.println(context.getBean("beanOne"));
        System.out.println(context.getBean("exampleBean"));
    }

    @Test
    void testSetterDI(){
        System.out.println(context.getBean("simpleMovieLister"));
    }

}
