
public class GenericDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * Multiple markers at this line
	- Hello is a raw type. References to generic type Hello<T> should be parameterized
	- Type safety: The constructor Hello(Object, Object) belongs to the raw type Hello. 
	 References to generic type Hello<T> should be parameterized
	- Hello is a raw type. References to generic type Hello<T> should be parameterized
		 */
		Hello hello=new Hello(10,20);
		//Hello<Object> hello=new Hello<Object>(10,20);
		int x=(Integer)hello.getAge();
		int y=(Integer)hello.getName();
       System.out.println("ÐÕÃû"+x);
       System.out.println("xingming"+y);
	}

}
