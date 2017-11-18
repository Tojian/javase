package fudao;

import java.util.Arrays;

/**
 * Created by Administrator on 2017/11/11 0011.
 */
public class InsertSort {
    // 直接插入排序

    public  static void insertSort( int arr[] ){

        // 从 0开始
        int tmp;
        for(int i = 1; i < arr.length; i++) {
            // 待插入数据
            tmp = arr[i];
            int j;
            for(j = i - 1; j >= 0; j--) {
                // 判断是否大于tmp，大于则后移一位
                if(arr[j] > tmp) {
                    arr[j+1] = arr[j];
                }else{
                    break;
                }
            }
            arr[j+1] = tmp;
            System.out.println(i + ":" + Arrays.toString(arr));
        }
    }

//    void InsertSort(SqList ＆L)
//    {int i,j;
//        for(i=2;i<=L.length;++i)
//            if( L.r[i].key<L.r[i-1].key)//将L.r[i]插入有序子表
//            { L.r[0]=L.r[i]; // 复制为哨兵
//                L.r[i]=L.r[i-1];
//                for(j=i-2; L.r[0].key<L.r[j].key;--j)
//                    L.r[j+1]=L.r[j]; // 记录后移
//                L.r[j+1]=L.r[0]; //插入到正确位置
//            }
//    }

    public static void main(String[] args) {
        int[] a = { 49, 38, 65, 97, 76, 13, 27, 50 };
        insertSort(a);
        for (int i : a)
            System.out.print(i + " ");
    }
    }
