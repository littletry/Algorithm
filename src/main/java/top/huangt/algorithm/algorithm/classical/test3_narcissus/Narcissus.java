package top.huangt.algorithm.algorithm.classical.test3_narcissus;

/**
 * Created by Intellij Idea
 * User：LittleTry
 * Date：2017/12/22
 * Time: 22:14
 *
 * @author LittleTry
 */
public class Narcissus {
    /**
     * 打印出所有的“水仙花数”，所谓的“水仙花数”是指一个三位数，其各位数字立方和等于该书本身。
     * 例如：153是一个“水仙花数”，因为153=1^3+5^3+3^3
     */
    public static void main(String[] args) {
        int a1;
        int a2;
        int a3;
        int begin = 101;
        int end = 1000;
        for (int i = begin; i < end; i++) {
            a1 = i / 100;
            a2 = i % 100 / 10;
            a3 = i % 10;
            if ((a1 * a1 * a1 + a2 * a2 * a2 + a3 * a3 * a3) == i) {
                System.out.println(i + " 是一个水仙花数");
            }
        }
    }
}
