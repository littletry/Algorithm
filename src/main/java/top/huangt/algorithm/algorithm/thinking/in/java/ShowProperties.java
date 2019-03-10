package top.huangt.algorithm.algorithm.thinking.in.java;

/**
 * @Author: ht
 * @Date: 2018-12-12 09:46
 */
public class ShowProperties {
    public static void main(String[] args) {
        System.getProperties().list(System.out);
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("java.library.path"));
    }
}
