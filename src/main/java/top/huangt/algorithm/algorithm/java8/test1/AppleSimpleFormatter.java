package top.huangt.algorithm.algorithm.java8.test1;

/**
 * @Author: ht
 * @Date: 2018-12-08 11:06
 */
public class AppleSimpleFormatter implements AppleFormatter {
    @Override
    public String accept(Apple apple) {
        return "An apple of " + apple.getWeight() + "g";
    }
}
