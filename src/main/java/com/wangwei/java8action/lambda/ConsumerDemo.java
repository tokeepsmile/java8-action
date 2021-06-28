package com.wangwei.java8action.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author wangwei
 * @date 2021-06-20 22:31
 * @since 1.0
 * java.util.function.Consumer<T>定义了一个名叫accept的抽象方法，它接受泛型T 的对象，没有返回(void)
 * 。你如果需要访问类型T的对象，并对其执行某些操作，就可以使用 这个接口。
 */
public class ConsumerDemo {
    public static void main(String[] args) {
        forEach(Arrays.asList("wangwei", "xiaoming", "datou"), System.out::println);
    }

    public static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }
    }
}
