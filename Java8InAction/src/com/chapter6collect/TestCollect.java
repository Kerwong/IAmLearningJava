package com.chapter6collect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * TestCollect
 *
 * @author wangwenchao02
 * Date: 2018/6/3
 */
public class TestCollect {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);

        nums.stream().collect(Collectors.counting());
        nums.stream().collect(Collectors.averagingInt(Integer::valueOf));
        nums.stream().count();
        Long sum1 = nums.stream().collect(Collectors.reducing(0L, e -> 1L, Long::sum));
        Long sum2 = nums.stream().map(e -> 1L).reduce(0L, Long::sum);

        //        nums.stream().reduce(0, )
        //        Double a = nums.stream().collect(Collectors.averagingInt(Integer::intValue));

        Optional<Integer> max = nums.stream().collect(Collectors.maxBy(Integer::compare));

        IntSummaryStatistics s = nums.stream().collect(Collectors.summarizingInt(Integer::valueOf));

        List<String> str = Arrays.asList("Hello", "World", "Java", "Lambda");
        String s1 = str.stream().collect(Collectors.joining(", "));
        String s2 = str.stream().reduce((a, b) -> a + ", " + b).get();

        System.out.println(s1);
        System.out.println(s2);

        str.stream().collect(Collectors.averagingDouble(Double::valueOf));

        nums.stream().collect(Collectors.toList());
        nums.stream().reduce(new ArrayList<>(),
                (List<Integer> l, Integer e) -> {
                    l.add(e);
                    return l;
                },
                (List<Integer> l1, List<Integer> l2) -> {
                    l1.addAll(l2);
                    return l1;
                });
    }
}
