package com.wangwei.java8action.stream;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author wangwei
 * @date 2021-06-20 23:49
 * @since 1.0
 */
public class FlatMapDemo {
    public static void main(String[] args) {
        String[] arr = {"Hello","World"};
        Arrays.stream(arr)
                .map(s -> s.split(""))
                // .map(Arrays::stream)
                .flatMap(Arrays::stream) //flatmap方法让你把一个流中的每个值都换成另一个流，然后把所有的流连接 起来成为一个流。
                .distinct()
                .forEach(System.out::println);
        /**
         * 给定一个数字列表，如何返回一个由每个数的平方构成的列表呢?例如，给定[1, 2, 3, 4, 5]，
         * 应该返回[1, 4, 9, 16, 25]
         */
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.stream()
                .map(i -> i*i)
                .forEach(System.out::println);

        /**
         * 给定两个数字列表，如何返回所有的数对呢?例如，给定列表[1, 2, 3]和列表[3, 4]，
         * 应 该返回[(1, 3), (1, 4), (2, 3), (2, 4), (3, 3), (3, 4)]。为简单起见，
         * 你可以用有两个元素的数组来代 表数对。
         */
        List<Integer> numbers1 = Arrays.asList(1, 2, 3);
        List<Integer> numbers2 = Arrays.asList(3, 4);
        List<int[]> collect = numbers1.stream()
                .flatMap(i -> numbers2.stream()
                        .map(j -> new int[]{i, j}))
                .collect(Collectors.toList());
        collect.forEach(System.out::println);

        Integer reduce = numbers1.stream().reduce(0, Integer::max);
        System.out.println(reduce);
    }


}
