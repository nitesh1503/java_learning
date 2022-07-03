/*All the banks operating in India are controlled by RBI. RBI has set a well defined guideline (e.g. minimum interest rate, 
minimum balance allowed, maximum withdrawal limit etc) which all banks must follow. For example, suppose RBI has set 
minimum interest rate applicable to a saving bank account to be 4% annually; however, banks are free to use 4% interest rate or to set any rates above it.
Write a java program to implement bank functionality in the above scenario. Note: Create few classes namely Customer, Account, RBI (Base Class) 
and few derived classes (SBI, ICICI, PNB etc). Assume and implement required member variables and functions in each class.*/

import java.util.*;
import java.util.Scanner;
class Customer
{
	String name,address;
	int age;
}
class Account
{
	String acctype,brnchtype;
}
class RBI
{
	int withdrawallimit,n;
	double A,P,r;
	float t;
	long avg,tot,mb;
	
	int withdrawallimit()
	{
		Scanner s=new Scanner(System.in);
		String acctype=s.next();
		String brnchtype=s.next();
		if(acctype=="Savings" && brnchtype=="Delhi")
		{
			withdrawallimit=10000;
		}
		else
		{
			withdrawallimit=5000;
		}
		return withdrawallimit;			
	}
	double setinterestrate()
	{
		A=(P+r)/n*t;
		return A;
	}
	long setMAB()
	{
		mb=(avg*tot)/31;
		return mb;
	}
}
class SBI extends RBI
{
	double setinterestrate()
	{
		A=P*(1+r/n)+n*t;
		return A;
	}
	long setMAB()
	{
		mb=(avg+tot)/30;
		return mb;
	}
}
class ICICI extends RBI
{
	double setinterestrate()
	{
		A=(P*r)/n+t;
		return A;
	}
	int setwithdrawallimit()
	{
		withdrawallimit=2000;
	
		return withdrawallimit;
	}
}
public class Inhtest
{
	public static void main(String[]args)
	{
		SBI sbi=new SBI();
		ICICI icici=new ICICI();
		sbi.P=10.123;
		sbi.r=7.432;
		sbi.t=5;
		sbi.n=2;
		Double sbiInt=sbi.setinterestrate();
		System.out.println("SBI interest rate is:"+sbiInt);
		int iciciInt=icici.setwithdrawallimit();
		System.out.println("ICICI withdrawal limit is:"+iciciInt);
	}
}
		
