
/**
 * ���һ��������
 * �������һ��ʹ�ô�д����ʽ���ұȽ϶̣�һ�������ʹ�ñ���E��ʾ���ϵ�Ԫ�ص�����
 * ����K��ʾ��Ĺؼ��֣�����V��ʾֵ������
 * ����T��ʾ�������ͣ���ʱ��ʹ��U��S 
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