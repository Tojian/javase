package thread;

public class MyThread1 implements Runnable { // 线程的主体类
	
	public void run() { // 线程的主方法
		System.out.println(Thread.currentThread().getName());
	}
}