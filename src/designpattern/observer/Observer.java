package designpattern.observer;

public interface Observer {

	//所有的观察者都必须实现这个方法，当值发生变化的时候，主题就会把这些状态值传递给观察者
	
	public void update(float temp,float humidity,float pressue);
}
