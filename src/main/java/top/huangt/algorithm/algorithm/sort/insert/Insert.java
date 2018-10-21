package top.huangt.algorithm.algorithm.sort.insert;

/**
 * Created by Intellij Idea
 * User：LittleTry
 * Date：2017/12/20
 * Time: 3:40
 *
 * @author LittleTry
 */
public class Insert {
    /**
     * 插入排序：大致思想就是两个数组，一个有序数组，一个无序数组，
     * 将无序数组插入有序数列中。其中将a[0]看成有序数组,
     * a[1,...,len-1]看成无序数组。
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] a = {2, 3, 45, 23, 14, 16, 25, 78, 11, 0};
        insert(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void insert(int[] a) {
        //数组长度
        int len = a.length;
        for (int i = 0; i < len; i++) {
            int temp = a[i];
            int j;
            //将a[i]插入a[0,..,i]序列中
            for (j = i - 1; j >= 0; j--) {
                if (a[j] <= temp) {
                    break;
                } else {
                    //插入有序数组时（从小到大），如果插入的数比当前数小，则向前插入，此时的数向后挪一位
                    a[j + 1] = a[j];
                }
            }
            //此时插入数在有序数列的位置
            a[j + 1] = temp;
        }
    }
}
