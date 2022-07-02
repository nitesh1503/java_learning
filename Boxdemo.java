import java.util.*;
class Box
 {
	private double width;
	private double height;
	private double depth;
	public Box() 
	{
		width=height=depth=0.0;
	}
	public Box(double w,double h,double d)
	{
		width=w;
		height=h;
		depth=d;
	}
	public void volume() 
	{
		System.out.println("Volume ="+(width*height*depth));
	}
        public void area()
        {
            System.out.println("Area ="+(width*depth));
        }
}
public class Boxdemo
{
	public static void main(String[] args) 
	{
		Box myBox1=new Box();
		Box myBox2=new Box(10,15,20);
		myBox1.volume();
		myBox2.volume();
                myBox1.area();
                myBox2.area();
	}
}
