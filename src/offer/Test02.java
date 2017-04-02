package offer;


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
		if(str==null||length<=0){
			System.out.println();
		}
		
		int originalLength=length;
		int numberBlank=0;
		int i=0;
		for(;i<length;i++){
			if(str[i]==' ')
				++numberBlank;
		}
		
		int newlength=originalLength+numberBlank*2;
		if(newlength>length)
			System.out.println();
		
		int indexofOriginal=originalLength;
		int indexOfNew=newlength;
		while(indexofOriginal>=0&&indexOfNew>indexofOriginal){
			if(str[indexofOriginal]==' '){
				str[indexOfNew--]='0';
				str[indexOfNew--]='2';
				str[indexOfNew--]='%';
			}else{
				str[indexOfNew--]=str[indexofOriginal];
			}
			--indexofOriginal;
		}
		return str;
	}
	public static void main(String[] args) {
		
	
		 char []str={'W','e',' ','a','r','e',' ','h','a','p','p','y'};
	  
	   char []strex  =exchangeString(str,str.length);
	    for(int i=0;i<strex.length;i++){
	    	System.out.print(strex[i]);
	    }
	}

}
