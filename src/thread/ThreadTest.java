package thread;



public class ThreadTest {
	public static void main(String[] args) throws Exception {
	/*	MyThread1 mt = new MyThread1();
		new Thread(mt).start();	// Thread-0
		new Thread(mt).start();	// Thread-1
		new Thread(mt).start();	// Thread-2
		new Thread(mt,"�߳�A").start();	// �߳�A
		new Thread(mt,"�߳�B").start();	// �߳�B
		
*/	
		MyThread1 mt = new MyThread1();
		//new Thread(mt, "�߳�").start(); // �����̣߳����������֣��߳�
		mt.run(); //	
	}
}
