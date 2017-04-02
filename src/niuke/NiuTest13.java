package niuke;

import java.util.Arrays;

/**
 * 
 * @author taojian
 * @time  2017年3月28日下午2:24:30
 * @ClassName NiuTest13.java
 * @description 输入一个字符串,要求输出字符串中字符所有的排列,
 * 例如输入"abc",得到"abc","acb","bca","bac","cab","cba"
 */
public class NiuTest13 {

    public static void p(char[] a, int index) {  
        if (a == null || index < 0)  
            return;  
        if (index == (a.length - 1))  
            System.out.println(Arrays.toString(a));  
              
        else {  
            for (int i = index; i < a.length; i++) {  
                char temp = a[i];  
                a[i] = a[index];  
                a[index] = temp;  
  
                p(a, index + 1);  
  
                temp = a[i];  
                a[i] = a[index];  
                a[index] = temp;  
  
            }  
        }  
    }  
  
    public static void main(String[] args) {  
        // TODO Auto-generated method stub  
        char[] a = { 'A', 'B', 'C' };  
        p(a, 0);  
    }  
}
