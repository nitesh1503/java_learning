import java.lang.Thread;
import java.io.*;

public class Threadpriority extends Thread
{
    public void run()
    {
        System.out.println("Inside the thread");
    }
    public static void main(String[]args)
    {
        Thread.currentThread().setPriority(8);
        
        System.out.println("priority of main method::"+Thread.currentThread().getPriority());
        
        Threadpriority tp=new Threadpriority();
         System.out.println("get proiority of new thread::"+ tp.getPriority());
         
        
        
        
        
    }
}
