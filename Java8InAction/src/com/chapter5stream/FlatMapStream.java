package com.chapter5stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * FlatMapStream
 *
 * @author wangwenchao02
 * Date: 2018/6/3
 */
public class FlatMapStream {

    public static void main(String[] args) throws IOException {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5);

        List<String> words = Arrays.asList("hello", "world");
        List<String> chars = words.stream().map(o -> o.split(""))
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());
        System.out.println(chars);

        int sum = list1.stream().reduce(0, (a, b) -> a + b);

        List<Integer> a = new ArrayList<>();

        Stream<Integer> s1 = Stream.of(1, 2, 3, 4);
        Stream<Object> s2 = Stream.builder().add(1).add(2).build(); // 只能构建 Object
        Stream<Integer> s3 = Stream.empty();    // 空的流

        IntStream s4 = Arrays.stream(new int[] {1, 2, 3, 4});

        Long count = Files.lines(Paths.get("/etc/hosts"))
                .parallel()
                .map(o -> o.split("\\W"))
                .flatMap(Arrays::stream)
                .filter(o -> !o.isEmpty())
                .count();

        System.out.println(count);

        Integer sum2 = Stream.iterate(0, n -> n * 2)
                .limit(100)
                .reduce(0, (a1, a2) -> a1 + a2);

        Stream.iterate(new int[] {1, 2}, o -> new int[] {o[1], o[0] + o[1]})
                .limit(20)
                .forEach(o -> System.out.println(o[0] + " " + o[1]));

        Stream.generate(() -> 1).limit(10);
        Stream.generate(Math::random).limit(10);

        //        LongStream.range(0, 100).forEach(System.out::println);
        //        System.out.println(s5);
    }
}
