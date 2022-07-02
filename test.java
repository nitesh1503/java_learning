class Test
{
	public static void main(String[]args)
	{
		try
		{
		Test t=new Test();
		t.divide();
		}
		catch(Exception e)
		{	
			System.out.println(e);
		}
		finally
		{
			System.out.println("i am in finally block");
		}
	}
	void divide()
	{
		int a=100,b=0,c;
			c=a/b;
			System.out.println(c);
	}
	
}
