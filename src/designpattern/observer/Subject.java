package designpattern.observer;

public interface Subject {

	//观察者注册
	
	public void  registerObserver(Observer o);
	//观察者移除
	
    public	void removeObserver(Observer o);
	//通知观察者
    
    public void notifyObserver();
}
