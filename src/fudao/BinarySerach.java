package fudao;

/**
 * Created by Administrator on 2017/11/14 0014.
 */
public class BinarySerach {
  // 如果数组是有序的，二分查找
    // 正常的二分查找
    static int binarySerach(int[] array, int key){
        int left = 0;
        int right = array.length - 1;

        // 这里必须是 <=
        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] == key) {
                return mid;
            }
            else if (array[mid] < key) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
     // 找不到 ，返回 -1
        return -1;
    }


   // 优化
    static int binarySerach1(int[] array, int key){
        int left = 0;
        int right = array.length - 1;

        // 这里必须是 <=
        while (left <= right) {


            // int mid = (left + right) / 2;
            int mid = (right - left ) /2+left;
            // int mid = (right -left) >>1 +left ;
            if (array[mid] == key) {
                return mid;
            }
            else if (array[mid] < key) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        // 找不到 ，返回 -1
        return -1;
    }




    // 数字在排序数组中出现的次数
    static int binarySerach4(int[] array, int key){
        int left = 0;
        int right = array.length - 1;

        int count = 0;
        // 这里必须是 <=
        while (left <= right) {


            // int mid = (left + right) / 2;
            int mid = (right - left ) /2+left;
            // int mid = (right -left) >>1 +left ;
            if (array[mid] == key) {
              count = 1;
              int temp = mid - 1;
              while (temp >= 0 && array[temp] == array[mid]){
                  count ++;
                  temp --;
              }
              temp =mid + 1 ;
              while (temp <array.length && array[temp] == array[mid]){
                  count ++;
                  temp --;
              }
            }
            else if (array[mid] < key) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        // 找不到 ，返回 -1
        return count;
    }
    // 查找第一个与key 相等的元素的下标
    static int binarySerach2(int[] array, int key){
        int left = 0;
        int right = array.length - 1;

        // 这里必须是 <=
        while (left <= right) {
            int mid = (right -left) >>1 +left ;
            if (array[mid] >= key) {
                right = mid -1;
            } else {
                left = mid +1;
            }
        }
        if( left <array.length && array[left]==key)
        {
            return left;
        }
        // 找不到 ，返回 -1
        return -1;
    }

    public static void main(String[] args) {
        int []a={1,2,3,4,5,6,7,8,9};

        int locate = binarySerach1(a , 5);

        for(int i=locate-1 ;i>0 ;i--){
            if(a[i]< a[locate]){
//                return -1;
            }
        }
        System.out.println("locate is :" + locate);
    }
}
