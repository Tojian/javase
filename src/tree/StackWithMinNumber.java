package tree;

import java.util.Stack;

/**
 * 
 * @author taojian
 * @time  2017年4月23日下午8:10:32
 * @ClassName StackWithMinNumber.java
 * @description 包含min()函数的栈
 */
public class StackWithMinNumber {
	public Stack<Integer> minStack =new Stack<>();
	public Stack<Integer> dataStack =new Stack<>();
	public void stackWithMinNumber(){
		
	}
	
	public void push(int item){
		dataStack.push(item); 
		if(minStack.size()==0||item<=minStack.peek()){ 
		  minStack.push(item); 
		}else{ 
		  minStack.push(minStack.peek()); 
		} 
		
	}
	
	public static void main(String[] args) {
		
	}
}
