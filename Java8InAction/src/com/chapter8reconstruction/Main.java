package com.chapter8reconstruction;import java.util.Arrays;import java.util.List;/** * Created by wangwenchao02 on 2017/8/22. */public class Main {    public static void main(String[] args) {        List<Integer> list = Arrays.asList(1, 2, 3, null);        list.stream()                .peek(x -> System.out.println("from stream: " + x))                .map(Integer::intValue)                .peek(x -> System.out.println("after map: " + x))                .forEach(System.out::println);    }}