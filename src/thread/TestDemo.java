package thread;

/*��һ�ַ�ʽ��
 * �̳�Thread��ķ�ʽ
 * �����̵߳�ʱ��ʹ��start()����
 * class MyThread extends Thread { // �̵߳�������
	private String title;
	public MyThread(String title) {
		this.title = title;
	}
	@Override
	public void run() { // �̵߳�������
		for (int x = 0; x < 50; x++) {
			System.out.println(this.title + "���У�x = " + x);
		}
	}
}*/

/**
 * ���ʱ���֮ǰ�ļ̳�Thread�����𲻴�
 * ����Ψһ�ĺô����Ǳ����˵��̳о��ޣ�������������Ҳ�����ˡ�
 * �ոս��͹������Ҫ���������߳�����Thread���start()������ɣ�
 * ֮ǰ�̳�Thread���ʱ����Խ��˷���ֱ�Ӽ̳й���ʹ�ã�������ʵ�ֵ���Runable�ӿڣ�
 * û������������Լ̳��ˣ�Ϊ�˽��������⣬������Ҫ����Thread����ɣ�
 * ��Thread���ж�����һ�����췽����public Thread(Runnable target)��
 * ����Runnable�ӿڶ���
 **/
class MyThread implements Runnable { // �̵߳�������
	private String title;
	public MyThread(String title) {
		this.title = title;
	}
	public void run() { // �̵߳�������
		for (int x = 0; x < 50; x++) {
			System.out.println(this.title + "���У�x = " + x);
		}
	}}
public class TestDemo {
	public static void main(String[] args) throws Exception {
		/*MyThread mt1 = new MyThread("�߳�A") ;
		MyThread mt2 = new MyThread("�߳�B") ;
		MyThread mt3 = new MyThread("�߳�C") ;*/
		/**
		 * �����ϵĲ���ʵ�����Բ�û���������������̣߳�
		 * ��Ϊ����̱߳˴�֮���ִ��һ���ǽ���ķ�ʽ���У�����ʱ��˳��ִ�У�
		 * ����ÿһ������Ĵ���ִ����֮������¼���ִ�С�
		 * ���Ҫ���ڳ���֮���������������̣߳�
		 * ��������Thread���һ��������public void start()��
		 * ��ʾ�����������̣߳����ô˷�������ӵ���run()������
		 */
		/*mt1.run() ;
		mt2.run() ;
		mt3.run() ;
		mt1.start();
		mt2.start();
		mt3.start();
		*/
		/**
		 * �ڶ��ַ�ʽ���ǵ�����Thread���������߳�
		 */
		
		MyThread mt1 = new MyThread("�߳�A");
		MyThread mt2 = new MyThread("�߳�B");
		MyThread mt3 = new MyThread("�߳�C");
		new Thread(mt1).start();
		new Thread(mt2).start();
		new Thread(mt3).start();
	}}