package top.huangt.algorithm.algorithm.sort.select;

/**
 * Created by Intellij Idea
 * User：LittleTry
 * Date：2017/12/20
 * Time: 3:43
 *
 * @author LittleTry
 */
public class Select2 {
    /**
     * 选择排序优化一：二元选择排序
     * 每次将无序数列的最大值换到后面，将最小值换到前面
     */
    public static void main(String[] args) {
        int[] a = {8, 1, 0, 2, 8, 6, 1};
        selectSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void selectSort(int[] a) {
        int len = a.length;
        int l = 0;
        int h = len - 1;
        while (l < h) {
            int[] count = selectMinMax(a, l, h);
            //将无序数列的最小值换到前面
            int temp = a[count[0]];
            a[count[0]] = a[l];
            a[l] = temp;
            if (count[1] == l) {
                //count[0]为无序数列的最小值位置，count[1]为无序数列的最大值位置，
                // 如果当count[0]挪到l位置时（a[1,..,l-1]为有序序列），
                // 可能会出现l位置就是最大值位置
                temp = a[count[0]];
                a[count[0]] = a[h];
                a[h] = temp;
            } else {
                temp = a[count[1]];
                a[count[1]] = a[h];
                a[h] = temp;
            }
            l++;
            h--;
        }
    }

    public static int[] selectMinMax(int[] a, int s, int t) {
        //count[0]-min,count[1]-max
        int[] count = {s, t};
        for (int i = s; i <= t; i++) {
            if (a[i] < a[count[0]]) {
                count[0] = i;
            }
            if (a[i] > a[count[1]]) {
                count[1] = i;
            }
        }
        return count;
    }
}
