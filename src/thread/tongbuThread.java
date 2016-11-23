package thread;

class MyThread3 implements Runnable { // 线程的主体类
	private int ticket = 6;
	@Override
	public void run() { // 线程的主方法
		for (int x = 0; x < 10; x++) {
			if (this.ticket > 0) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()
						+ "卖票，ticket = " + this.ticket--);
			}
		}
	}
}
public class tongbuThread {
	public static void main(String[] args) throws Exception {
		MyThread3 mt = new MyThread3();
		new Thread(mt, "票贩子A").start();
		new Thread(mt, "票贩子B").start();
		new Thread(mt, "票贩子C").start();
		new Thread(mt, "票贩子D").start();
		new Thread(mt, "票贩子E").start();
	}
}
