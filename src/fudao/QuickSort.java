package fudao;

/**
 * Created by Administrator on 2017/11/11 0011.
 */
public class QuickSort {

    public static int partition(int []array,int left,int right){
        //固定的切分方式
        int key = array[left];
        while(left < right){
            while(array[right] >= key && right > left){//从后半部分向前扫描
                right--;
            }
            array[left] = array[right];
            while(array[left] <= key && right>left){// 从前半部分向后扫描
                left++;
            }
            array[right] = array[left];
        }
        array[right] = key;
        return right;
    }

    public static void sort(int[] array,int left ,int hi){
        if(left>=hi){
            return ;
        }
        int index=partition(array,left,hi);
        sort(array,left,index-1);
        sort(array,index+1,hi);
    }

    public static void main(String[] args) {

    }
}
