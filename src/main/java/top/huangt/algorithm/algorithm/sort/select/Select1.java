package top.huangt.algorithm.algorithm.sort.select;

/**
 * Created by Intellij Idea
 * User：LittleTry
 * Date：2017/12/20
 * Time: 3:43
 *
 * @author LittleTry
 */
public class Select1 {
    /**
     * 选择排序：每趟选择出最小的数放在数组最前面
     */
    public static void main(String[] args) {
        int[] a = {2, 3, 45, 23, 14, 16, 25, 78, 11, 0};
        select(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void select(int[] a) {
        int len = a.length;
        for (int i = 0; i < len; i++) {
            int min = selectMin(a, i, len - 1);
            //将无序数列的最小值换到前面
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }
    }

    public static int selectMin(int[] a, int s, int t) {
        int count = s;
        for (int i = s; i <= t; i++) {
            if (a[i] < a[count])
                count = i;
        }
        return count;
    }
}
