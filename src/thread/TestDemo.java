package thread;

/*第一种方式，
 * 继承Thread类的方式
 * 启动线程的时候使用start()方法
 * class MyThread extends Thread { // 线程的主体类
	private String title;
	public MyThread(String title) {
		this.title = title;
	}
	@Override
	public void run() { // 线程的主方法
		for (int x = 0; x < 50; x++) {
			System.out.println(this.title + "运行，x = " + x);
		}
	}
}*/

/**
 * 这个时候和之前的继承Thread类区别不大，
 * 但是唯一的好处就是避免了单继承局限，不过现在问题也就来了。
 * 刚刚解释过，如果要想启动多线程依靠Thread类的start()方法完成，
 * 之前继承Thread类的时候可以将此方法直接继承过来使用，但现在实现的是Runable接口，
 * 没有这个方法可以继承了，为了解决这个问题，还是需要依靠Thread类完成，
 * 在Thread类中定义了一个构造方法：public Thread(Runnable target)，
 * 接收Runnable接口对象。
 **/
class MyThread implements Runnable { // 线程的主体类
	private String title;
	public MyThread(String title) {
		this.title = title;
	}
	public void run() { // 线程的主方法
		for (int x = 0; x < 50; x++) {
			System.out.println(this.title + "运行，x = " + x);
		}
	}}
public class TestDemo {
	public static void main(String[] args) throws Exception {
		/*MyThread mt1 = new MyThread("线程A") ;
		MyThread mt2 = new MyThread("线程B") ;
		MyThread mt3 = new MyThread("线程C") ;*/
		/**
		 * 是以上的操作实话而言并没有真正的启动多线程，
		 * 因为多个线程彼此之间的执行一定是交替的方式运行，而此时是顺序执行，
		 * 即：每一个对象的代码执行完之后才向下继续执行。
		 * 如果要想在程序之中真正的启动多线程，
		 * 必须依靠Thread类的一个方法：public void start()，
		 * 表示真正启动多线程，调用此方法后会间接调用run()方法。
		 */
		/*mt1.run() ;
		mt2.run() ;
		mt3.run() ;
		mt1.start();
		mt2.start();
		mt3.start();
		*/
		/**
		 * 第二种方式还是得利用Thread类来启动线程
		 */
		
		MyThread mt1 = new MyThread("线程A");
		MyThread mt2 = new MyThread("线程B");
		MyThread mt3 = new MyThread("线程C");
		new Thread(mt1).start();
		new Thread(mt2).start();
		new Thread(mt3).start();
	}}