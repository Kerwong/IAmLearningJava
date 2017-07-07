package com.chapter1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by wangwc on 2017/6/11.
 */
public class Filter {
    public interface Predicate<T> {
        boolean test(T t);
    }

    public static List<Apple> filterApple(List<Apple> inventory, Predicate<Apple> p) {
        List<Apple> result = new ArrayList<>();

        for (Apple apple : inventory) {
            if (p.test(apple)) {
                result.add(apple);
            }
        }

        return result;
    }
}
