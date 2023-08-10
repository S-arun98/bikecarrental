import java.util.Scanner;
class Loop3
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a=obj.nextInt();
		System.out.println("Enter the value of b");
		int b=obj.nextInt();
		do
		{
		System.out.println("Enter the value of c");
		int c=obj.nextInt();
		if(c==2)
		{
		
		System.out.println(a+b);
		}
		else
		{
		System.out.println(a +"and" +b );	
		}	
		}
		while(true);
	}
}