package top.huangt.algorithm.algorithm.java8.test1;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: ht
 * @Date: 2018-12-08 14:03
 */
public class GenerateApples {
    public List<Apple> generateApples() {
        List<Apple> apples = new ArrayList<>();
        Apple apple1 = new Apple("a1", "green", 160);
        Apple apple2 = new Apple("a2", "red", 120);
        Apple apple3 = new Apple("a3", "blue", 151);
        Apple apple4 = new Apple("a4", "black", 148);
        Apple apple5 = new Apple("a5", "purple", 130);
        Apple apple6 = new Apple("a6", "brown", 159);
        apples.add(apple1);
        apples.add(apple2);
        apples.add(apple3);
        apples.add(apple4);
        apples.add(apple5);
        apples.add(apple6);
        return apples;
    }

    public List<Integer> generateInts() {
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(9);
        ints.add(3);
        ints.add(23);
        ints.add(4);
        ints.add(12);
        return ints;
    }

    public interface Predicate<T> {
        boolean test(T t);
    }

    public List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> p) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple: inventory) {
            if (p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }
}
