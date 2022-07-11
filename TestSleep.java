import java.lang.Thread;
import java.io.*;
public class TestSleep 
{
    public static void main(String[]args)
    {
        try
        {
            for(int i=1;i<5;i++)
            {
                Thread.sleep(500);
                System.out.println(i);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
                    
                 
                   
        }
        
    }
