package com.javase.designpattern.observer;

public interface Subject {

	//�۲���ע��
	
	public void  registerObserver(Observer o);
	//�۲����Ƴ�
	
    public	void removeObserver(Observer o);
	//֪ͨ�۲���
    
    public void notifyObserver();
}
