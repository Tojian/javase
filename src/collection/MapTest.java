package collection;

import java.util.HashMap;
import java.util.Map;


public class MapTest {
 
	public static void main(String[] args) {
	
		Map<String ,Integer> map =new HashMap<String, Integer>();
		map.put("一", 1);
		map.put("二", 2);
		map.put("三", 3);
		map.put("四", 4);
		map.put(null, 0);
		//map.put("四",33);
		/**
		 * {三=3, 一=1, 二=2, 四=4}
		 * 输出是无序的，如果发现了重复的key，就会覆盖
		 * 
		 */
		System.out.println(map);

	
	}
}
