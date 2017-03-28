package offer;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author taojian
 * @time  2017年3月24日下午3:32:45
 * @ClassName Test02.java
 * @description 替换空格
 * 请实现一个函数，把字符串中的每个空格替换成"%20"。例如输入“We are happy”,则输出“We%20are%20happy”
 */
public class Test02 {
	
	//java内部有个方法，可以直接实现，但是底层运用了StringBuffer
	public static String exchangeString01(String str){
		
		String replacement="%20";
		String target=" ";
		String newstr=str.replaceAll(target, replacement);
		
		return newstr;
	}

	/**
     * @descripe 如果采用字符串数组就要考虑扩容的问题了
     * 最直观的解法就是每次遇到一次就会发生扩容，向后面扩容
	 */
	public static char[] exchangeString(char [] str,int length){
		List list=new ArrayList();
		length=str.length;
		for(int i=0;i<length;i++){
			if(str[i]==' '){
				//向后面移动两位
				str=new char[length+2];
				for(int j=length;j<i;j--){
					str[j]=str[j+2];
				}
			}
		}
		
		return str;
		
	}
	public static void main(String[] args) {
		
		/*
		 * 这是第一种方法进行测试
		 * String str="We are happy";
		String newstr=exchangeString01(str);
		System.out.println(newstr);*/
		
	}

}
