/*Anshul transport company charges for the parcels of its customers as per the following specifications given below:
Class name: Atransport
Member variables:
String name – to store the name of the customer
int w – to store the weight of the parcel in Kg
int charge – to store the charge of the parcel
Member functions:
void accept ( ) – to accept the name of the customer, weight of the parcel from the user (using Scanner class)
void calculate ( ) – to calculate the charge as per the weight of the parcel as per the following criteria:
Weight in Kg	Charge per Kg
Upto 10 Kgs	Rs.25 per Kg
Next 20 Kgs	Rs.20 per Kg
Above 30 Kgs	Rs.10 per Kg
A surcharge of 5% is charged on the bill.
void print ( ) – to print the name of the customer, weight of the parcel, total bill inclusive of surcharge in a tabular form in the following format:
Name    Weight    Bill amount.
-------    -------    -------------
Define a class with the above-mentioned specifications, create the main method, create an object and invoke the member methods.
*/
import java.util.*;
import java.util.Scanner;
public class Atransport 
{
    private String name;
    private int w;
    private int charge;
    
    public void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter customer name:");
        name=sc.next();
        System.out.println("Enter the weight of your parcel:");
        w=sc.nextInt();
    }   
    public void customer()
    {
        if(w<=10)
            charge=w*charge;
        else if(w<=30)
            charge=250+((w-10)*20);
            charge=250+400+((w-30)*10);
            charge+=charge*5/100;
                
    }
    public  void print()
    {
         System.out.println("Name\tWeight\tBill amount");
        System.out.println("----\t-----\tBill -----");
        System.out.println(name + "\t" + w + "\t" + charge);
    
    }
    public static void main(String[]args)
    {
        Atransport At=new Atransport();
        At.accept();
        At.customer();
        At.print();
        
    }
}
