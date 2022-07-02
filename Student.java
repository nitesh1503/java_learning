import java.util.Scanner;
interface Show
{
	abstract void showdetails();
}
class Student implements Show
{
	public void showdetails()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter your age");
		int age=s.nextInt();
		System.out.println("enter your Name");
		String name=s.next();
		System.out.println("enter your reg_no");
		int reg_no=s.nextInt();
		
		System.out.println("...............");
		System.out.println("age:"+age);
		System.out.println("name:"+name);
		System.out.println("reg_no:"+reg_no);
		
	}	
	public static void main(String[]args)
	{
		Student st=new Student();
		st.showdetails();
	}
}
