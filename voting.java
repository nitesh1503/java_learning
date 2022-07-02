import java.util.Scanner;
class YoungerageException extends RuntimeException
{
	YoungerageException(String msg)
	{
		super(msg);
	}
}
class voting
{
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your age");
		
		int age=s.nextInt();
		try
		{
			if(age<18)
			{
				throw new YoungerageException("You cannot voting");
			}
			else
			{
				System.out.println("You can voting");
			}
		}
		catch(Exception e)	
		{
			System.out.println(e);
		}
		System.out.println("Nitesh");
	}
}
