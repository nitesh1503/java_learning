import java.util.*;
public class Sumoverload 
{
    public int Sum(int A, int B) 
    {
        int sum = 0;
        for (int i = A; i <= B; i++)
        {
            if (i % 2 == 0)
                sum += i;
        }
        return sum;
    }
    public int Sum(int N) {
        int sum = 0;
        while (N != 0) {
            int d = N % 10;
            if (d % 2 != 0)
                sum += d;
            N /= 10;
        }
        return sum;
    }
    public static void main(String args[]) 
    {
        Sumoverload obj = new Sumoverload();
        
        int evenSum = obj.Sum(3, 10);
    
        System.out.println("Even sum from 3 to 10 = " + evenSum);
        int oddDigitSum = obj.Sum(43961);
        System.out.println("Odd Digits Sum = " + oddDigitSum);
    }
}
    
