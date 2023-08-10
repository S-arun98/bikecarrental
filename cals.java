import java.util.Scanner;
public class cals{
	public static void main(String args[]){
    System.out.println("enter the first number");
	Scanner num2=new Scanner(System.in);
	int a=num2.nextInt();
	System.out.println("enter the second number");
	Scanner num3=new Scanner(System.in);
	int b=num3.nextInt();
	System.out.println("enter the mathematical operation");
	Scanner num4=new Scanner(System.in);
	char c=num4.next().charAt(0);
	int d=a+b;
	int e=a-b;
	int f=a*b;
	int g=a/b;
	switch(c){
		case '+':
		System.out.println("The addition value of a "+a +" "+ "b "+b+" is " +d);
		break;
		case '-':
		System.out.println("The subtraction value of a "+a +" "+ "b "+b+" is " +e);
		break;
		case '*':
		System.out.println("The multiplication value of a "+a +" "+ "b "+b+" is " +f);
		break;
		case '/':
		System.out.println("The division value of a "+a +" "+ "b "+b+" is " +g);
		break;
	
	
	}
	}
}