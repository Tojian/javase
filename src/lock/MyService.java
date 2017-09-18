package lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Administrator on 2017/9/5 0005.
 */
public class MyService  {

    private Lock lock=new ReentrantLock();

    public  void testMethod(){
        lock.lock();
        for (int i = 0; i <5;i++){
            System.out.println("Thread name is "+Thread.currentThread().getName()+"i ="+i);
        }
        lock.unlock();
    }

}
