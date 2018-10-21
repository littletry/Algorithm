package top.huangt.algorithm.algorithm.sort.bubble;

/**
 * Created by Intellij Idea
 * User：LittleTry
 * Date：2017/12/20
 * Time: 3:37
 *
 * @author LittleTry
 */
public class BubbleSort3 {
    /**
     * 冒泡排序的优化二：将大数向下沉同时小数向上浮。
     */
    public static void main(String[] args) {
        int[] a = {2, 3, 45, 23, 14, 16, 25, 78, 11, 0};
        bubbleSort3(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    private static void bubbleSort3(int[] a) {
        //数组长度
        int len = a.length;
        int hight = len - 1;
        int low = 0;
        while (low < hight) {
            //大数下沉
            for (int i = low; i < hight; i++) {
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
            }
            //每趟数组大数下沉到无序数组最后面，后面大数已排序好（这地方可以优化，
            // 可以每趟给一个变量记录其最后交换的位置，说明变量后面的数组已排序好）
            hight--;
            for (int i = hight; i > low; i--) {
                if (a[i] < a[i - 1]) {
                    int temp = a[i];
                    a[i] = a[i - 1];
                    a[i - 1] = temp;
                }
            }
            //每趟数组小数上浮到无序数组最前面，前面的小数已排序好
            low++;
        }
    }
}
