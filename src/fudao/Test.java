package fudao;

/**
 * Created by Administrator on 2017/11/18 0018.
 */
public class Test {

    public static void Print(int w)
    {
        int i;
        if (w!=0)
        {
            Print(w-1);
            for(i=1;i<=w;i++)
            System.out.print(" " + i);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Print(10);
    }
}
