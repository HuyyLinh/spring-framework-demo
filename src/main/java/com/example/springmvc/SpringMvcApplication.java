package com.example.springmvc;

import com.example.springmvc.jpetstore.services.PetStoreServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@Controller
public class SpringMvcApplication {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("services.xml", "daos.xml");
//      PetStoreServiceImpl petStoreService = (PetStoreServiceImpl) context.getBean("petStore");
        PetStoreServiceImpl petStoreService1 = context.getBean("petStore",PetStoreServiceImpl.class);
        System.out.println(petStoreService1.getAccountDao() );
        System.out.println(petStoreService1.getItemDao() );
        System.out.println(petStoreService1.name);

//       SpringApplication.run(SpringMvcApplication.class, args);
    }

}
