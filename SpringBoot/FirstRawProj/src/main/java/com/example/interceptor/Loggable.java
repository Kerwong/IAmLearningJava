package com.example.interceptor;

import java.lang.annotation.*;

/**
 * Created by Kerwong on 2017/6/21.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Loggable {

}
