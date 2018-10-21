package top.huangt.algorithm.algorithm.sort.bubble;

/**
 * Created by Intellij Idea
 * User：LittleTry
 * Date：2017/12/20
 * Time: 3:35
 *
 * @author LittleTry
 */
public class BubbleSort1 {
    /**
     * 冒泡排序：大数向下沉，小数向上浮
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] a = {2, 3, 45, 23, 14, 16, 25, 78, 11, 0};
        bubbleSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void bubbleSort(int[] a) {
        //数组长度
        int len = a.length;
        //每趟把最大数下沉到数组最后面
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - 1; j++) {
                //如果数组后面的数比前面的小，则往后换下沉
                if (a[j + 1] < a[j]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
}
