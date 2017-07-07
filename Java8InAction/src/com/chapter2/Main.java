package com.chapter2;

import com.chapter1.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by wangwc on 2017/6/11.
 */
public class Main {
    private List<Apple> inventory = new ArrayList<>();

    public static void main(String[] args) {
        Main main = new Main();
        Filter.filterApple(main.inventory, new AppleGreenPredicate());

        Filter.filterApple(main.inventory, (Apple a) -> "green".equals(a.getColor()));

        Filter.filter(main.inventory, (Apple a) -> "red".equals(a.getColor()));
        Filter.filter(Arrays.asList(new Integer(11), new Integer(22)), (Integer i) -> i % 2 == 0);


    }
}
