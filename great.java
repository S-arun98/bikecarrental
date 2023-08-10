import java.util.Scanner;
public class great{
	public static void main(String args[]){
		Scanner numa=new Scanner(System.in);
		System.out.println("Enter the number a");
		int a=numa.nextInt();
		Scanner numb=new Scanner(System.in);
		System.out.println("Enter the number b");
		int b=numb.nextInt();
		Scanner numc=new Scanner(System.in);
		System.out.println("Enter the number c");
		int c=numc.nextInt();
		
		if((a>b)&&(a>c)){
		System.out.println("the greatest number is a "+a);
		}
		else if((b>a)&&(b>c)){
		System.out.println("the greatest number is b "+b);
		}	
		else if((c>a)&&(c>b)){
		System.out.println("the greatest number is c "+c);
		}	
	}
}