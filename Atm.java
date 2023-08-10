import java.util.Scanner;
class Atm
{
  static void A()
  {
	System.out.println("For Deposite select d" +"/n"+ "For Withdrawal select w ");
	Scanner obj=new Scanner(System.in);
	char method=obj.next().charAt(0);
	if(method=='d')
	{
		System.out.println("Enter the Amount for deposite and place the money inside the machine  Rs:");
	    int money=obj.nextInt();
		System.out.println("Amount deposited is Rs."+" "+ money);
		int total=total+money;
		System.out.println("Total amount in your account is Rs."+" "+ cash);
	}
	else if(method=='w')
	{ 
        
		System.out.println("Total amount in your account is Rs."+" "+ cash);
	    System.out.print("Enter the Amount for withdrawal and get the cash from the machine Rs :");
	    int money2=obj.nextInt();	
		System.out.println("Amount withdrawn is Rs."+" "+ money2);
		int total2=total2-money2;
		System.out.println("Balance amount in your account is Rs."+" "+ cash);
		
		
	}
	else
	{
		System.out.println("Sorry for the inconvinence");
	}
	    System.out.println("Thank you for using our ATM, Visit again!!");
		 
		B(); 
		
  }
    static void B()
	{
		A();
	}	

    public static void main(String args[])
    {
	Scanner obj=new Scanner(System.in);
	System.out.print("Name  :");
	String name=obj.next();
	System.out.print("Account number  :");
	double num=obj.nextDouble();
	System.out.print("Branch  :");
	String branch=obj.next();
	int total=0;
	int total2=0;
	static int cash=20000+total+total2;
	
	A();
	B();
    }
}