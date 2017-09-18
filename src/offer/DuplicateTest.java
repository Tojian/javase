package offer;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Administrator on 2017/9/13 0013.
 *
 * 题目描述
 在一个长度为n的数组里的所有数字都在0到n-1的范围内。 数组中某些数字是重复的，
 但不知道有几个数字是重复的。也不知道每个数字重复几次。请找出数组中任意一个重复的数字。
 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是重复的数字2或者3
 */
public class DuplicateTest {

    //排序，

    //用hashmap
    public ArrayList<Integer> duplicateNumber(int [] number){

        ArrayList<Integer> arrayList=new ArrayList<>();
        if(number.length<0)
            return null;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<number.length;i++){
            if(map.containsValue(number[i])){
                arrayList.add(number[i]);
            }else map.put(i,number[i]);
        }
        return  arrayList;
    }


    /**
     * 我们注意到数组中的数字都是在0-n-1之间，如果这个数组中没有重复的数字，那么当数组排序之后数字i将会出现在下标为i的位置
     * 由于数组中有重复的数字，有些位置存在多个数字，同时有些位置可能没有数字
     * 
     */
}
