//java program to create a ATM Program using swicth case..   
import java.util.Scanner;  
public class ATM  
{  
    //declare variables and take a value from user at run time
    public static void main(String args[] )  
    {  
        int bal = 100000, with_draw, deposit;  
        Scanner sc = new Scanner(System.in);  
          
        while(true)  
        {  
            System.out.println("ATM");  
            System.out.println("Choose 1 for Withdraw");  
            System.out.println("Choose 2 for Deposit");  
            System.out.println("Choose 3 for Check Balance");  
            System.out.println("Choose 4 for EXIT");  
            System.out.print("Choose any operation you want to perform:");  
              
            //take a choice from user 
            int ch = sc.nextInt();  
            switch(ch)  
            {  
                case 1:  
        System.out.print("Enter money to be withdrawn from a/c:");  
                      
        //get the withdrawl amount from user..
        with_draw = sc.nextInt();  
                      
        //check conditon for balance is greater than or equal to the withdrawal amount . 
        if(bal >= with_draw)  
        {  
            //Deduct the withdrawl amount from  total balance  
            bal = bal - with_draw;  
            System.out.println("Please collect your money");  
        }  
        else  
        {  
            //show erroe if amount is greater than balanace 
            System.out.println("Insufficient Balance");  
        }  
        System.out.println("");  
        break;  
   
                case 2:  
                      
        System.out.print("Enter money to be deposited:");  
                      
        //get deposite amount from te user  
        deposit = sc.nextInt();  
                      
        //add  amount to the total balanace  .
        bal = bal + deposit;  
        System.out.println("Your Money has been successfully depsited");  
        System.out.println("");  
        break;  
   
                case 3:  
        //displaying balance of the user..  
        System.out.println("Balance : "+bal);  
        System.out.println("");  
        break;  
   
                case 4:  
        //exit from the menu  
        System.exit(0);  
            }  
        }  
    }  
}