package tree;
/**
 * 
 * @author taojian
 * @time  2017年4月23日下午9:01:55
 * @ClassName Permutation.java
 * @description  字符串的全排序
 */
public class Permutation {

	public static void permutation(char[] str){
        if(str == null){
            return;
        }

        permutation(str, 0);
    }

    private static void permutation(char[] str, int begin) {

        if(begin == str.length){
            System.out.println(str);
        }

        else{
            for(int i = begin; i < str.length; i++){
                char temp = str[begin];
                str[begin] = str[i];
                str[i] = temp;

                permutation(str, begin + 1);

                temp = str[begin];
                str[begin] = str[i];
                str[i] = temp;

            }
        }

    }

    public static void main(String[] args) {

        char[] str = {'a', 'b', 'c'};
        permutation(str);
    }

}
