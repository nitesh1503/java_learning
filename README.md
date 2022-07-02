import java.io.*;
public class Atm 
{
       public static void displaybalance(int balance)
       {
           System.out.println("Currentbalance:"+balance);
           System.out.println();
           
           
       }
        public static int Withdrawamount(int balance,int withdrawamount)
        {
            System.out.println("Withdrawing option:");
            System.out.println("Withdrawing Amount:"+withdrawamount);
            if(balance>=withdrawamount)
            {
                balance = balance - withdrawamount;
                 System.out.println("your transcation succesfull pls collect your cash and collect your card");
                 displaybalance(balance);
                         
            }
            else
            {
                System.out.println("Sorry you have Insuficient balance");
                System.out.println();
            }
            return balance;
        }
        public static int amountDepositing(int balance,int depositamount)
                {
                    System.out.println("Deposit option");
                    System.out.println("Deposit Amount:"+depositamount);
                    balance=balance+depositamount;
                    System.out.println("Your money is succesfully deposited:"+balance);
                    return balance;
                            
                }
        public static void main(String[]args)
        {
            int balance=20000;
            int withdrawamount=5000;
            int depositamount=2000;
           
            displaybalance(balance);
            
            Withdrawamount(balance,withdrawamount);
            
            amountDepositing( balance, depositamount);
        }    
            
            
}            
