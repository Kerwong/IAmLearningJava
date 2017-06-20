package com.example.config;

import com.example.service.PersonService;
import com.example.service.impl.PersonServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by Kerwong on 2017/6/21.
 */
@Configuration
public class ProfileConfig {
    @Bean
    @Profile("dev")
    public PersonService devPersonService() {
        return new PersonServiceImpl("DEV");
    }

    @Bean
    @Profile("prod")
    public PersonService pordPersonService() {
        return new PersonServiceImpl("PROD");
    }
}
