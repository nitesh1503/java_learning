/*Create a base class with an abstract print( ) method that is overridden in a derived class. 
The overridden version of themethod prints the value of an int variable defined in the derivedclass. 
At the point of definition of this variable, give it a nonzerovalue.
In the base-class constructor, call this method. In main( ),create an object of the derived type, and then call its print( )method. Explain the results. */

class Base
{	
	Base()
	{	
		System.out.println("Base constructor");
		method();
	}
	void method(){}
}
class Derived extends Base
{
	int var=2;
	void Derived()
	{
		System.out.println("Derived constructor");
	}
	void method()
	{
		System.out.println("var = "+var);
	}
	
}
class Test2
{
	public static void main(String[]args)
	{
		Derived b=new Derived();
	
		
	}
}
