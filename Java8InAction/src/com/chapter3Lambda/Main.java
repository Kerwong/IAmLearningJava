package com.chapter3Lambda;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Created by wangwenchao02 on 2017/8/17.
 */
public class Main {

    public static void main(String[] args) throws IOException {

        List<Integer> list = new ArrayList<>();

        list.sort((Integer n1, Integer n2) -> -n1.compareTo(n2));

        String line = FileProcessorUtil.processFile((BufferedReader br) -> br.readLine() + br.readLine());

        System.out.println(line);

        list.stream().sorted(Comparator.comparing(Integer::intValue));

        Function<Integer, Integer> function = ((Function<Integer, Integer>) (x -> x*x)).andThen((x -> x+1));
        int x = function.apply(10);

        Supplier<Letter> l = Letter::new;
        Function<String, String> ll = l.get()::addHeader;
        Function<String, String> letterPipeline = ll.andThen(l.get()::addHeader).andThen(l.get()::addFooter);
        String letter = letterPipeline.apply("testestetstsabfjvb");
        System.out.println(letter);
    }
}
