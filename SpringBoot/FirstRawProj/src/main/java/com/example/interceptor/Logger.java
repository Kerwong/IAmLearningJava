package com.example.interceptor;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by Kerwong on 2017/6/21.
 */
@Aspect
@Component
public class Logger {

    @Pointcut("@annotation(com.example.interceptor.Loggable)")
    public void logPointCut() {}

    @Before("logPointCut()")
    public void before(JoinPoint jp) {
        System.out.println("Run Method " + jp.getSignature().getName().toString());
    }
}
