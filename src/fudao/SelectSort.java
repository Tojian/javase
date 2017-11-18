package fudao;

/**
 * Created by Administrator on 2017/11/11 0011.
 */
public class SelectSort {
    // 选择排序


    public static void selectionSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int k = i;
            // 找出最小值的小标
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[k]) {
                    k = j;
                }
            }
            // 将最小值放到排序序列末尾
            if (k > i) {
                int tmp = a[i];
                a[i] = a[k];
                a[k] = tmp;
            }
        }
    }
    public static void main(String[] args) {
        int[] a = { 49, 38, 65, 97, 76, 13, 27, 50 };
        selectionSort(a);
        for (int i : a)
            System.out.print(i + " ");
    }
}
