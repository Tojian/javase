package fudao;

import java.util.Arrays;

/**
 * Created by Administrator on 2017/11/11 0011.
 */
public class BubbleSort {

    // 冒泡排序
    public static void BubbleSort(int[] arr) {
        int temp;//定义一个临时变量
        for(int i=0;i<arr.length-1;i++){//冒泡趟数
            for(int j=0;j<arr.length-i-1;j++){// 内层循环控制每一趟排序多少次
                if(arr[j+1]<arr[j]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            System.out.println(i + ":" + Arrays.toString(arr));
        }
    }
/**设置一个标志，如果这一趟发生了交换，则为true，否则为false。明显如果有一趟没有发生交换，说明排序已经完成。
 * @param a
 * @param n
 */
    public static void bubbleSort2(int [] a, int n){
        int j, k = n;
        boolean flag = true;//发生了交换就为true, 没发生就为false，第一次判断时必须标志位true。
        while (flag){
            flag=false;//每次开始排序前，都设置flag为未排序过
            for(j = 1; j < k; j++){
                if(a[j-1] > a[j]){//前面的数字大于后面的数字就交换
                    //交换a[j-1]和a[j]
                    int temp;
                    temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;

                    //表示交换过数据;
                    flag = true;
                }
            }
            k--;//减小一次排序的尾边界
        }//end while
    }//end


    public static void main(String[] args) {
        int[] a = { 49, 38, 65, 97, 76, 13, 27, 50 };
        bubbleSort2(a ,a.length);

        for (int i : a)
            System.out.print(i + " ");
    }
}
