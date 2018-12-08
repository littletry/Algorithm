package top.huangt.algorithm.algorithm.java8.test1;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: ht
 * @Date: 2018-12-08 10:07
 */
public class PrettyApple {

    private static void prettyPrintApple(List<Apple> inventory, AppleFormatter formatter) {
        for(Apple apple: inventory) {
            String output = formatter.accept(apple);
            System.out.println(output);
        }
    }

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

        prettyPrintApple(apples, new AppleFancyFormat());

        prettyPrintApple(apples, new AppleSimpleFormatter());
    }
}
