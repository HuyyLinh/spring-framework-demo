package com.example.springmvc;

import com.example.springmvc.annotationconfig.MovieRecommender;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Assert;

public class AnnotationTest {
    ApplicationContext context;
    @BeforeEach
    void setContext() {
        context = new ClassPathXmlApplicationContext("annotationconfig.xml");
    }

    @Test
    void testAutoWireContrustor(){
        System.out.println(context.getBean("movieRecommender", MovieRecommender.class).toString());
    }
}
