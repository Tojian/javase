package thread;

public class TestProductorAndConsumer {

	public static void main(String[] args) {
		Clerk clerk = new Clerk();
		Productor pro = new Productor(clerk);
		Consumer cus = new Consumer(clerk);
		
		new Thread(pro,"生产者").start();
		new Thread(cus,"消费者").start();
	}
	
}
class Clerk {
	private int product = 0;
	public synchronized void get(){
		if(product >= 1){
			System.out.println("产品已满");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}else{
			System.out.println(Thread.currentThread().getName()+":"+ ++product);
			notifyAll();
		}
	}
	public synchronized void sale(){
		if(product <= 0){
			System.out.println("缺货！");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}else{
			System.out.println(Thread.currentThread().getName()+":"+ --product);
			notifyAll();
		}
	}
}

class Productor implements Runnable{
    private Clerk clerk;
	public Productor(Clerk clerk) {
		this.clerk = clerk;
	}
	@Override
	public void run() {
		for(int i = 0;i < 20;i++){
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			clerk.get();
		}
	}
}

class Consumer implements Runnable{
    Clerk clerk;
    public Consumer(Clerk clerk) {
    	this.clerk = clerk;
	}
	
	@Override
	public void run() {
		for(int i = 0;i < 20;i++){
			clerk.sale();
		}
	}
	
}
