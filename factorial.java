public class factorial 
{
    public static void main(String[]args)
    {
        int i,factorial=1;
        int number=6;
        for(i=1;i<=number;i++)
        {
            factorial=factorial*i;
        }
        System.out.println("Factorial of"+number+"is:"+factorial);
    }
}
