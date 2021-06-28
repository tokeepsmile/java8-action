package com.wangwei.java8action.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author wangwei
 * @date 2021-06-20 23:41
 * @since 1.0
 */
public class StreamDemo2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
        numbers.stream()
                .filter(i -> i % 2 == 0)
                .distinct()
                .forEach(System.out::println);


        List<String> words = Arrays.asList("Java 8", "Lambdas", "In", "Action");
        List<Integer> list = words.stream()
                .map(String::length)
                .collect(Collectors.toList());
    }
}
