package thread;

public class MyThread1 implements Runnable { // �̵߳�������
	
	public void run() { // �̵߳�������
		System.out.println(Thread.currentThread().getName());
	}
}