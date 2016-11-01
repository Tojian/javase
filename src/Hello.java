
/**
 * 设计一个泛型类
 * 这个变量一般使用大写的形式，且比较短，一般情况下使用变量E表示集合的元素的类型
 * 变量K表示表的关键字，变量V表示值得类型
 * 变量T表示任意类型，有时候使用U和S 
 */
public class Hello<T>{
	
	private T name;
	private T  age;
	public Hello(){
		
	}
	public Hello(T name,T age){
		this.name=name;
		this.age=age;
	}
	public T getName() {
		return name;
	}
	public void setName(T name) {
		this.name = name;
	}
	public T getAge() {
		return age;
	}
	public void setAge(T age) {
		this.age = age;
	}
 
	
	
	
}