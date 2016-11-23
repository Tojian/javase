package thread;
/**
 * 
 * @titleThreadTest.java
 * @author taojian
 * @date2016-11-9����8:13:24
 * �̵߳�����ָ�����ó����ִ���ٶȱ���һЩ��������public static void sleep(long millis) 
 * throws InterruptedException�����õ����ߵ�λ�Ǻ��롣
 */
class MyThread2 implements Runnable { // �̵߳�������
	@Override
	public void run() { // �̵߳�������
		for (int x = 0; x < 100; x++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "��x = " + x);
		}
	}
}
/**
 * ���ʱ�����ڵ��Ե�ִ���ٶ�ԭ��
 * ���е��߳��Ⱥ�˳�򲢲����׷��֣����ǿ��Է���������֮�󣬳��������ٶȱ����ˣ��������е�ʱ��������Ҹ��߳�ͬʱ���У�˳��ͬ
 */
public class ThreadTest {
	public static void main(String[] args) throws Exception {
		MyThread2 mt = new MyThread2();
		new Thread(mt, "�߳�A").start();
		new Thread(mt, "�߳�B").start();
		new Thread(mt, "�߳�C").start();
		new Thread(mt, "�߳�D").start();
		new Thread(mt, "�߳�E").start();
	}
}



