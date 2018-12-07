package top.huangt.algorithm.algorithm.java8.test1;

import java.util.ArrayList;
import java.util.List;
import static java.util.stream.Collectors.toList;

/**
 * @Author: ht
 * @Date: 2018-12-04 17:05
 */
public class FilterApples {

    public interface Predicate<T> {
        boolean test(T t);
    }

    private static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> p) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple: inventory) {
            if (p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

    /**
     * jdk8中使用了::的用法。就是把方法当做参数传到stream内部，使stream的每个元素都传入到该方法里面执行一下，
     * 双冒号运算就是Java中的[方法引用],[方法引用]的格式是：<类名：：方法名>
     */
    public static void main(String[] args) {
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

        List<Apple> apples1 = filterApples(apples, Apple::isGreenApple);
        printApple("apples1", apples1);
        List<Apple> apples2 = filterApples(apples, Apple::isHeavyApple);
        printApple("apples2", apples2);
        List<Apple> apples3 = apples.stream().filter((Apple a) -> a.getWeight() > 150).collect(toList());
        printApple("apples3", apples3);
        List<Apple> apples4 = apples.parallelStream().filter((Apple a) -> a.getWeight() > 150).collect(toList());
        printApple("apples4", apples4);

    }
    private static void printApple(String whichApples, List<Apple> apples) {
        System.out.println(whichApples + ":");
        for (Apple apple: apples) {
            System.out.println(apple.toString());
        }
    }

}
