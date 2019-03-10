package top.huangt.algorithm.algorithm.small.program;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author ht
 * @date 2019-03-10 14:26
 */
public class NumberOfCharacters {
    /**
     * 键盘输入字符串，统计字符出现次数
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串");
        String str = sc.nextLine();
        char[] attr = str.toCharArray();
        HashMap<Character, Integer> hm = new HashMap<>();
        for (Character c: attr) {
            hm.put(c, !hm.containsKey(c) ? 1: hm.get(c) + 1);
        }
        for (Character c: hm.keySet()) {
            System.out.println(c + "=" + hm.get(c));
        }
    }
}
