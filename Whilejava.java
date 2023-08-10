import java.util.Scanner;
class Whilejava
{
public static void main(String args[])
 {  
    Scanner obj=new Scanner(System.in);
	System.out.println("Enter the initialisation value a ");
	int a=obj.nextInt(); 
	System.out.println("Enter the condition value b ");
	int b=obj.nextInt();
	while(a>=b)
	{
		System.out.println(a);
		a-=5;
	}
 }	
}