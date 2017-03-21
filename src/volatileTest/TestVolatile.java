package volatileTest;

import javax.swing.plaf.synth.SynthSpinnerUI;

class ThreadDemo implements Runnable{

    private volatile boolean flag = false;


    public boolean isFlag() {
        return flag;
    }


    public void setFlag(boolean flag) {
        this.flag = flag;
    }


    @Override
    public void run() {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        setFlag(true);
        System.out.println("flag = "+flag);

    }

}

public class TestVolatile {

    public static void main(String[] args) {

        ThreadDemo td = new ThreadDemo();
        new Thread(td).start();

        while(true){
        
        	//synchronized(td){
            if(td.isFlag()==true){
                System.out.println("---------------");
                break;
            }
        }

    }

}