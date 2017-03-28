package stringoff;



/**
 * 
 * @author taojian
 * @time  2017年3月22日下午1:11:01
 * @ClassName BfTest.java
 * @description 简单的朴素模式匹配算法
 */
public class BfTest {
//	System.out.println(System.currentTimeMillis());
	int index(String str,String substr){
	
		int i=0;
		int j=0;
		int k=0;
		
		while(i<str.length()&&j<substr.length()){
		
			if(str.charAt(i)==substr.charAt(j)){
				++i;
				++j;
				
			}else{
				j=0;
				i=++k;
			}
		}
		if(j==substr.length())
			return k;
		else return -1;
	}
	
	public static void main(String[] args) {
		//System.out.println(System.currentTimeMillis());
		String str="ABABCABCACBAB";
		String substr="ABCAC";
		BfTest bf=new BfTest();
		System.out.println(bf.index(str,substr));
	//	System.out.println(System.currentTimeMillis());
	}

}
