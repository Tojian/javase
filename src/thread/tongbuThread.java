package thread;

class MyThread3 implements Runnable { // �̵߳�������
	private int ticket = 6;
	@Override
	public void run() { // �̵߳�������
		for (int x = 0; x < 10; x++) {
			if (this.ticket > 0) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()
						+ "��Ʊ��ticket = " + this.ticket--);
			}
		}
	}
}
public class tongbuThread {
	public static void main(String[] args) throws Exception {
		MyThread3 mt = new MyThread3();
		new Thread(mt, "Ʊ����A").start();
		new Thread(mt, "Ʊ����B").start();
		new Thread(mt, "Ʊ����C").start();
		new Thread(mt, "Ʊ����D").start();
		new Thread(mt, "Ʊ����E").start();
	}
}
