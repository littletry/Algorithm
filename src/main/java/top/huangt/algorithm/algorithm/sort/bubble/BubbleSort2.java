package top.huangt.algorithm.algorithm.sort.bubble;

/**
 * Created by Intellij Idea
 * User：LittleTry
 * Date：2017/12/20
 * Time: 3:36
 *
 * @author LittleTry
 */
public class BubbleSort2 {
    /**
     * 冒泡排序的优化一：用一个变量记录每趟大数下沉的位置，
     * 标量值说明该变量后面数组已排序完成
     */
    public static void main(String[] args) {
        int[] a = {2, 3, 45, 23, 14, 16, 25, 78, 11, 0};
        bubbleSort2(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    private static void bubbleSort2(int[] a) {
        //数组长度
        int len = a.length;
        int i = len - 1;
        while (i > 0) {
            int pos = 0;
            //只需排序a[0,1,...,pos]
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    pos = j;
                }
            }
            //下一趟，a[pos+1,...,len-1]已排序好
            i = pos;
        }
    }
}
