
import java.lang.reflect.Constructor;
class Person {	// CTRL + K
	public Person() {}
	public Person(String name) {}
	public Person(String name,int age) {}
}
public class Demo {
	public static void main(String[] args) throws Exception {
		Class<?> cls = Class.forName("Person") ;	// ȡ��Class����
		Constructor<?> cons [] = cls.getConstructors() ;	// ȡ��ȫ������
		for (Constructor<?> a:cons) {
			System.out.println(a);
		}
	}
}