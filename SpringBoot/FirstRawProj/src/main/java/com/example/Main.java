package com.example;

import com.example.config.DiConfig;
import com.example.config.ProfileConfig;
import com.example.service.PersonService;
import com.example.service.impl.PersonServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Kerwong on 2017/6/21.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
        context.getEnvironment().setActiveProfiles("dev");
        context.register(ProfileConfig.class);
        context.refresh();

        PersonService ps = context.getBean(PersonServiceImpl.class);
        System.out.println(ps.sayHi());

        context.close();
    }
}
