package thread;
/**
 * 
 * @titleThreadTest.java
 * @author taojian
 * @date2016-11-9下午8:13:24
 * 线程的休眠指的是让程序的执行速度变慢一些，方法：public static void sleep(long millis) 
 * throws InterruptedException，设置的休眠单位是毫秒。
 */
class MyThread2 implements Runnable { // 线程的主体类
	@Override
	public void run() { // 线程的主方法
		for (int x = 0; x < 100; x++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "，x = " + x);
		}
	}
}
/**
 * 这个时候由于电脑的执行速度原因，
 * 所有的线程先后顺序并不容易发现，但是可以发现休眠了之后，程序运行速度变慢了，这里运行的时候变慢，且各线程同时运行，顺序不同
 */
public class ThreadTest {
	public static void main(String[] args) throws Exception {
		MyThread2 mt = new MyThread2();
		new Thread(mt, "线程A").start();
		new Thread(mt, "线程B").start();
		new Thread(mt, "线程C").start();
		new Thread(mt, "线程D").start();
		new Thread(mt, "线程E").start();
	}
}



