package com.example.service.impl;

import com.example.service.PersonService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by Kerwong on 2017/6/21.
 */
@Component
public class PersonServiceImpl implements PersonService {

    public PersonServiceImpl() {
        System.out.println("p");
    }

    public PersonServiceImpl(String name) {
        System.out.println(name);
    }

    @PostConstruct
    public void init() {
        System.out.println("init");
    }

    @PreDestroy
    public void destory() {
        System.out.println("destory");
    }

    @Override
    @Profile("prod")
    public String sayHi() {
        System.out.println("Hello World");
        return "Hi";
    }

    @Override
    @Profile("dev")
    public String sayDevHi() {
        System.out.println("Fuck World");
        return "Hi";
    }
}
