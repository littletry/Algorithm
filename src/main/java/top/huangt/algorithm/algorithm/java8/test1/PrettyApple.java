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
        GenerateApples generateApples = new GenerateApples();
        List<Apple> apples = generateApples.generateApples();

        prettyPrintApple(apples, new AppleFancyFormat());

        prettyPrintApple(apples, new AppleSimpleFormatter());
    }
}
