package top.huangt.algorithm.algorithm.java8.test1;

/**
 * @Author: ht
 * @Date: 2018-12-08 10:11
 */
public class AppleFancyFormat implements AppleFormatter {
    @Override
    public String accept(Apple apple) {
        String characteristic = apple.getWeight() > 150 ? "heavy" : "light";
        return "A " + characteristic + " " + apple.getColor() + " apple";
    }
}
