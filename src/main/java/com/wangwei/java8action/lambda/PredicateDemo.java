package com.wangwei.java8action.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author wangwei
 * @date 2021-06-20 22:01
 * @since 1.0
 * java.util.function.Predicate<T>接口定义了一个名叫test的抽象方法，它接受泛型 T对象
 * ，并返回一个boolean
 */
public class PredicateDemo {
    public static void main(String[] args) {

        // Predicate<String> nonEmptyStringPredicate = (String s) -> !s.isEmpty();
        Predicate<Integer> integerPredicate = (Integer i) -> i != 0;
    }

    public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> results = new ArrayList<>();
        for(T s: list){
            if(predicate.test(s)){
                results.add(s);
            } }
        return results;
    }
}
