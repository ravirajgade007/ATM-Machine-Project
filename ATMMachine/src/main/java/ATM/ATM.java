package ATM;

import java.util.Scanner;

public class ATM 
{
   Scanner sc = new Scanner(System.in);
   double balance;
   String pin = "Raj1234";
   int attempt = 3;
   
   void checkPin()
   {
	   
	 while(attempt > 0)
	 
	 {
	    attempt--;
	   System.out.print("Enter Pin:");
	   String pin1 = sc.next();
	   
	   if(pin1.equals(pin))
	    {
		   System.out.println();
		   System.err.println("*****WELCOME*****");
		   menu();
	    }
	   else
	    {
		   System.err.println("Incorrect Password"); 
	    }
	   System.out.println("Attempt Remaining:" + attempt);
	   System.out.println(); 
     }
	 System.err.println("SORRY YOUR ATM PIN IS BLOCKED FOR 24 HOURS");
  }
   void menu()
   {
	   System.out.println("1.Check Account Balance \n2.Deposit Money \n3.Withdraw Money \n4.Exit");
     
      System.out.print("\nSELECT ANY ONE:");
      int option = sc.nextInt();
      
      if(option == 1)
      {
    	checkAccount();  
      }
      else if(option == 2)
      {
    	  depositMoney();
      }
      else if(option == 3)
      {
    	  withdrawMoney();
      }
      else if(option == 4)
      {
    	  System.exit(0);
      
      }
      else
      {
    	  System.err.println("Enter Correct Option");
    	  
      }  
   }
   
   void checkAccount()
   {
	   System.out.println("Balance:"+balance);
	   System.out.println();
	   menu();
   }
   
   void depositMoney()
   {
	   System.out.print("Enter Money to Deposit:");
	   double ammount = sc.nextDouble();
	   
	   balance = balance + ammount;
	   System.err.println("Money Deposit Successfully");
	   System.out.println();
	   menu();
   }
   
   void withdrawMoney()
   {
	   System.out.print("Enter Money to Withdraw:");
	   double ammount = sc.nextDouble();
	   
	   if(ammount > balance)
	   {
		   System.err.println("In-sufficient Balance");
		   System.out.println("1st add Money then Withdraw");
		   System.out.println();
		   menu();
	   }
	   else
	   {
		   balance = balance - ammount;
		   System.err.println("Money Withdraw Successfully");
		   System.out.println();
		   menu();
	   }
   }
   
   void exit()
   {
	   
	   System.exit(4);
	   
   }
}

