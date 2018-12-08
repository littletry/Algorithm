package top.huangt.algorithm.algorithm.java8.test2;

/**
 * @Author: ht
 * @Date: 2018-12-08 14:19
 */
public class MeaningOfThis {
    public final int value = 4;
    public void doIt() {
        int value = 6;
        Runnable r = new Runnable() {
            public final int value = 5;
            @Override
            public void run() {
                int value = 10;
                System.out.println(this.value);
            }
        };
        r.run();
    }
    public static void main(String...args) {
        MeaningOfThis m = new MeaningOfThis();
        // 输出结果为5
        m.doIt();
    }
}
