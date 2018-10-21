package top.huangt.algorithm.algorithm.sort.heap;

/**
 * Created by Intellij Idea
 * User：LittleTry
 * Date：2017/12/20
 * Time: 3:39
 *
 * @author LittleTry
 */
public class Heap {
    /**
     * 堆排序：首先建立一个最大堆，堆顶元素为最大值，
     * 每次将堆顶元素换到数组后面，这样一次循环就可以得到从小到大的有序数组
     */
    public static void main(String[] args) {
        int[] a = {0, 8, 1, 2, 8, 6, 1};
        int len = a.length;
        //建立一个最大堆
        for (int i = (len / 2 - 1); i >= 0; i--) {
            //从有叶子的父节点建立最大堆，从下到上
            maxHeapFixDown(a, i, len);
        }
        //堆顶元素为堆的最大值，每次把堆顶换到数组后面，一次次循环就使数组变成从小到大排序
        for (int i = a.length - 1; i >= 0; i--) {
            int temp = a[i];
            a[i] = a[0];
            a[0] = temp;
            maxHeapFixDown(a, 0, i);
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    /**
     * 因为我们要从小到大排序，所以需要建立一个最大堆，从i开始到n-1，此时应满足a[i]>a[i+1,...,n-1]
     */
    public static void maxHeapFixDown(int[] a, int i, int n) {
        int temp = a[i];
        int j = 2 * i + 1;
        while (j < n) {
            if ((j + 1) < n && a[j] < a[j + 1]) {
                j++;
            }
            if (a[j] < temp) {
                break;
            }
            a[i] = a[j];
            i = j;
            j = 2 * j + 1;
        }
        a[i] = temp;
    }
}
