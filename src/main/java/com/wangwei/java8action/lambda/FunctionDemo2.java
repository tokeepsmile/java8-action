package com.wangwei.java8action.lambda;


import java.util.function.Function;

/**
 * @author wangwei
 * @date 2021-06-20 23:07
 * @since 1.0
 */
public class FunctionDemo2 {
    public static void main(String[] args) {
        Function<Integer, Integer> f = i -> i+1;
        Function<Integer, Integer> g = i -> i*2;

        // andThen方法会返回一个函数，它先对输入应用一个给定函数，再对输出应用另一个函数
        // Function<Integer, Integer> h = f.andThen(g); //相当于 g(f(x))

        // 先把给定的函数用作compose的参数里面给的那个函 数，然后再把函数本身用于结果
        Function<Integer, Integer> h = f.compose(g); //相当于 f(g(x))
        Integer apply = h.apply(1);
        System.out.println(apply);
    }
}
