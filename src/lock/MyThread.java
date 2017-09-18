package lock;

/**
 * Created by Administrator on 2017/9/5 0005.
 */
public class MyThread extends Thread {

   private MyService service;

    public MyThread(MyService service) {
        this.service=service;

    }

    @Override
    public void run() {
        service.testMethod();
    }
}
