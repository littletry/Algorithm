package top.huangt.algorithm.algorithm.java8.test3;

import top.huangt.algorithm.algorithm.java8.test1.Apple;
import top.huangt.algorithm.algorithm.java8.test1.GenerateApples;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: ht
 * @Date: 2018-12-08 14:29
 */
public class Parameterization {

    public interface Predicate<T> {
        boolean test(T t);
    }

    public static <T> List<T> filter(List<T> list, Predicate<T> p) {
        List<T> result = new ArrayList<>();
        for (T e : list) {
            if (p.test(e)) {
                result.add(e);
            }
        }
        return result;
    }

    public static void main(String... args) {
        GenerateApples generateApples = new GenerateApples();
        List<Apple> apples = generateApples.generateApples();

        List<Apple> redApples = filter(apples, (Apple apple) -> "red".equals(apple.getColor()));
        List<Integer> evenNumbers = filter(generateApples.generateInts(), (Integer i) -> i % 2 == 0);

        for (Apple apple: redApples) {
            System.out.println(apple.toString());
        }

        for (int i: evenNumbers) {
            System.out.println(i);
        }
    }
}
