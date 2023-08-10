import java.util.Scanner;
class Atm2
{
public static void main(String args[])
{
	int balance=200000;
	int withdraw;
	int deposit;
	Scanner obj=new Scanner(System.in);
	
	while(true)
	{
		System.out.println("Welcome to Arun international bank-AIB");
		System.out.println("choose 2 for withdrawal");
		System.out.println("choose 3 for deposit");
		System.out.println("choose 4 to check your balance");
		System.out.println("Please choose anyone of his options");
		
		int option=obj.nextInt();
		
		switch(option)
		{
		case 2:
            System.out.println("Your current balance is :Rs."+ balance);
			System.out.println("Enter the amount for withdrawal :Rs.");
			withdraw=obj.nextInt();
			if(balance>=withdraw)
			{
			balance=balance-withdraw;
			System.out.println("Your amount has been successfully withdrawn");
			System.out.println("Your current balance after withdrawal is :Rs." + balance);
			}
			else
			{
			System.out.println("Your balance is not sufficient for your withdrawal");	
			}	
		break;
		
		case 3:
		    System.out.println("Your current balance is :Rs."+ balance);
			System.out.println("Enter the amount for Deposit :Rs.");
			deposit=obj.nextInt();
			balance=balance+deposit;
			System.out.println("Your amount has been successfully deposited");
			System.out.println("Your current balance after deposit is :Rs." + balance);
			break;
			
		case 4:	
		    System.out.println("Your current balance is :Rs."+ balance);
			break;
		default:
            System.out.println("Sorry,The option you entered is wrong. Please select correct option");		
		}
		System.out.println("Thanks for using our bank ATM, Visit again.");
		System.out.println(" ");
	}	
}
}