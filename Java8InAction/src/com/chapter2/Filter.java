package com.chapter2;

import com.chapter1.Apple;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by wangwc on 2017/6/11.
 */
public class Filter {

    public static List<Apple> filterApple(List<Apple> inventory, ApplePredicate p) {
        List<Apple> result = new ArrayList<>();

        for (Apple apple : inventory) {
            if (p.test(apple)) {
                result.add(apple);
            }
        }

        return result;
    }

    public static <T> Collection<T> filter(Collection<T> c, Predicate<T> p) {
        Collection<T> result = null;

        for (T t : c) {
            if (p.test(t)) {
                result.add(t);
            }
        }

        return result;
    }
}
