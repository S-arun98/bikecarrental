import java.util.Scanner;
public class sign{
	public static void main(String args[])
	{   Scanner num=new Scanner(System.in);
	    System.out.print("Enter a number  ");
	    int a=num.nextInt();
		
		if(a>=0){
		System.out.println("the number is positive");
		}
		else{
		System.out.println("the number is negative");	
		}
	}
	
}