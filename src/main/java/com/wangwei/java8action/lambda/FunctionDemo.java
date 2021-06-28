package com.wangwei.java8action.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * @author wangwei
 * @date 2021-06-20 22:22
 * @since 1.0
 * java.util.function.Function<T, R>接口定义了一个叫作apply的方法，它接受一个 泛型T的对象，
 * 并返回一个泛型R的对象。如果你需要定义一个Lambda，将输入对象的信息映射 到输出，就可以使用这个接口
 */
public class FunctionDemo {
    public static void main(String[] args) {
        List<Integer> map = map(Arrays.asList("lambdas", "in", "action"), String::length);
        map.forEach(System.out::println);
    }

    public static <T, R> List<R> map(List<T> list, Function<T, R> f) {
        List<R> result = new ArrayList<>();
        for (T t : list) {
            result.add(f.apply(t));
        }
        return result;
    }
}
