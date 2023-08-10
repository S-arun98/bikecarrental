import java.util.Scanner;
class Loop2
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a=obj.nextInt();
		System.out.println("Enter the value of b");
		int b=obj.nextInt();
		System.out.println("Enter the value of c");
		int c=obj.nextInt();
		
		do
		{
			System.out.println(a+b);
		}
		while(c==1);
		
	}
}