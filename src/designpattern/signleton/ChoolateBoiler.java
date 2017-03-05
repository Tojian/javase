package designpattern.signleton;
/**
 * 
 * @author taojian
 * @time  2017年3月5日下午6:31:48
 * @ClassName ChoolateBoiler.java
 * @description 现代化的巧克力工厂具备计算机控制的巧克力锅炉。锅炉要做的事情就是把巧克力和
 * 牛奶融在一起，进入到下一个阶段，将普通类改写成单例模式
 */
public class ChoolateBoiler {
    private boolean empty;
    private boolean boiled;
    private static ChoolateBoiler uniqueInstance;
    
    private ChoolateBoiler() {
        empty=true;
        boiled=false;
      
      }
    /**
    //代码开始的时候，锅炉是空的
    public ChoolateBoiler() {
      empty=true;
      boiled=false;
    
    }*/
    /**
     * 
     * @author taojian
     * @time 2017年3月5日下午6:45:22
     * @methodname getInstance()
     * @descripe 处理多线程的问题，只要把getInstance()改成同步的方法，多线程灾难几乎就可以轻易解决
     * 通过synchronized关键字到getInstance()方法中，我们迫使每个线程在进入这个方法之前，要先等候别的线程离开该方法，也就是说不可以有两个
     * 线程可以同时进入这个方法。
     */
    public static synchronized ChoolateBoiler getInstance(){
    	
    	if(uniqueInstance==null){
    		uniqueInstance=new ChoolateBoiler();
    	}
    	return uniqueInstance;
    }
    public  void fill() {
     if(isEmpty()){
       empty=false;
       boiled=false;
     }
    }
    //锅炉排出时，必须是满的（不可以是空的）而且是煮过的，排出完毕后，把empty标志设为true；
    public void drain(){
        if(!isEmpty()&&isBoiled()){
            empty=true;
        }
        
        
    }
    
    public void boil(){
        if(!isEmpty()&&!isBoiled()){
            boiled=true;
        }
        
        
    }
    
    public  boolean isBoiled() {
        // TODO Auto-generated method stub
        return boiled;
    }
    public  boolean isEmpty() {
        // TODO Auto-generated method stub
        return empty;
    }
}