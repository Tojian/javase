package list;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import org.junit.Test;

public class EntryTest {

	@Test
	public void testMap(){
		//创建一个map集合
		Map<Integer,String> map=new HashMap<>();
		
		map.put(10, "wuhan");
		map.put(11, "wuhan");
		Set<Integer> set=map.keySet();
		
		//set.iterator()返回在此 set 中的元素上进行迭代的迭代器。返回的元素没有特定的顺序（除非此 set 是某个提供顺序保证的类的实例）。
		Iterator<Integer> it=set.iterator();
		//遍历map
		// 如果有下一个
		while(it.hasNext()){
		// 找到键值
		Integer key=it.next();
		System.out.println(key);
		// 找到键值所对应的值  map.get(key)
		String value=map.get(key);
		// 输出数组
		System.out.println(key+"-"+value);
		}
		}

	@Test
	public void testMap3(){
	  Map<Integer,String> map = new HashMap<Integer,String>();
	  map.put(100,"jack");
	  map.put(200,"marry");
	  map.put(300,"sisi");
	  Set<Entry<Integer,String>> set=map.entrySet();
	  Iterator<Entry<Integer,String>> it=set.iterator();
	  while(it.hasNext()){
	  Entry<Integer,String> entry=it.next();
	  Integer key=entry.getKey();
	  String value=entry.getValue();
	  System.out.println(key+"-"+value);
	}
	
}}
