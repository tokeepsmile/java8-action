package com.wangwei.java8action.stream;

import com.wangwei.java8action.stream.entity.Dish;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.partitioningBy;

/**
 * @author wangwei
 * @date 2021-06-20 23:31
 * @since 1.0
 */
public class StremDemo {
    private static final List<Dish> MENU;
    static {
        MENU = Arrays.asList(
                new Dish("pork", false, 800, Dish.Type.MEAT),
                new Dish("beef", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("season fruit", true, 120, Dish.Type.OTHER),
                new Dish("pizza", true, 550, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("salmon", false, 450, Dish.Type.FISH) );
    }
    public static void main(String[] args) {
        List<String> list = MENU.stream()
                .filter(d -> d.getCalories() > 300)
                .map(Dish::getName)
                .limit(3)
                .collect(Collectors.toList());
        list.forEach(System.out::println);

        boolean isHealthy = MENU.stream()
                .allMatch(d -> d.getCalories() < 1000);

        Map<Boolean, List<Dish>> partitionedMenu = MENU.stream()
                .collect(partitioningBy(Dish::isVegetarian));
        partitionedMenu.forEach((k, v) -> {
            System.out.println(k);
            System.out.println(v);
        });
    }
}
