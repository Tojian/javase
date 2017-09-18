package refect;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import math.MathDemo;
/**
 * 演示通过反射创建私有化类的对象、调用私有方法、改变私有属性
 * @author 王凯旋
 * @date 2015-08-31 13:55:16
 */
public class Demo {
    public static void main(String[] args) throws Exception {
        /*
         * 使用反射创建构造方法私有化的类对象
         * 类：MathDemo
         * 构造方法：private MathDemo()
         */
        //1.获取类的无参构造方法
        Constructor<MathDemo> constructor = MathDemo.class.getDeclaredConstructor();
        //2.设置取消访问检查，是访问私有构造方法的关键
        constructor.setAccessible(true);
        //3.调用该构造方法，获得对象
        MathDemo mathDemo = constructor.newInstance();
        
        /*
         *  使用反射调用类的私有方法
         *  类：MathDemo
         *  方法：private int add(int a,int b)
         */
        //1.根据方法名和方法参数获取方法对象
        Method method = MathDemo.class.getDeclaredMethod("add", int.class,int.class);
        //2.取消访问检查，是访问私有方法的关键
        method.setAccessible(true);
        //3.调用私有方法并获得返回值
        int  i = (Integer) method.invoke(mathDemo, 1,2);
        System.out.println(i);
        
        /*
         * 使用反射改变类的私有属性
         * 类：MathDemo
         * 属性：private int m = 10;
         */
        //1.根据属性名m获取属性
        Field field = MathDemo.class.getDeclaredField("m");
        //2.取消访问检查，是访问私有属性的关键
        field.setAccessible(true);
        //3.设置私有属性m为20
        field.setInt(mathDemo, 20);
        System.out.println(mathDemo);
    }
}
 