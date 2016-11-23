package collection;

import java.util.ArrayList;
import java.util.List;

public class TestDemo {
	
  public static void main(String[] args) {
	List<String >all=new ArrayList<String>();
	all.add("hello");
	all.add("hello");
	all.add("world");
  /*  for(int x=0;x<all.size();x++){
    	String str=all.get(x);
    	System.out.print(str+"、");
    			
    }*/
	/**
	 * 	在使用代码的时候可以发现，List集合之中即使存在了重复数据，
	 * 也可以正常的保存，而且数据保存的顺序就是存入数据的顺序。
	 */
   /* for(String list:all){
    	System.out.println(list);
    }*/
  System.out.println(all);
  }
}
