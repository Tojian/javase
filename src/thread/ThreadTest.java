package thread;



public class ThreadTest {
	public static void main(String[] args) throws Exception {
	/*	MyThread1 mt = new MyThread1();
		new Thread(mt).start();	// Thread-0
		new Thread(mt).start();	// Thread-1
		new Thread(mt).start();	// Thread-2
		new Thread(mt,"线程A").start();	// 线程A
		new Thread(mt,"线程B").start();	// 线程B
		
*/	
		MyThread1 mt = new MyThread1();
		//new Thread(mt, "线程").start(); // 启动线程，并设置名字，线程
		mt.run(); //	
	}
}
