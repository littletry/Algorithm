package top.huangt.algorithm.algorithm.sort.quick;

/**
 * Created by Intellij Idea
 * User：LittleTry
 * Date：2017/12/20
 * Time: 3:42
 *
 * @author LittleTry
 */
public class Quick {
    /**
     * 快速排序：选第一个元素作为基准元素，把小于这个基准元素的值放到前面，
     * 把大于这个基准元素的值放到后面。
     * 每次这个基准元素的最后位置也就是有序数列最后的位置，
     * a[0,...,m-1] <a[m]<a[m+1,..,n]，再从前面的a[0,...,m-1]进行上面的重复操作即可
     */
    public static void main(String[] args) {
        int[] a = {0, 8, 1, 2, 8, 6, 1};
        int len = a.length;
        quickSort(a, 0, len - 1);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void quickSort(int[] a, int s, int t) {
        if (s < t) {
            int x = a[s];
            int i = s;
            int j = t;
            while (i < j) {
                while (i < j && a[j] >= x) {
                    j--;
                }
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                while (i < j && a[i] <= x) {
                    i++;
                }
                temp = a[j];
                a[j] = a[i];
                a[i] = temp;
            }
            quickSort(a, s, i - 1);
            quickSort(a, i + 1, t);
        }
    }
}
