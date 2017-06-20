package com.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by Kerwong on 2017/6/21.
 */
@Configuration
@ComponentScan("com.example.interceptor")
@EnableAspectJAutoProxy
public class AopConfig {
}
