import java.util.Scanner;
public class Ret2{
	public static void main(String args[]){
		Scanner value=new Scanner(System.in);
		System.out.println("Enter the value for a");
		int a=value.nextInt();
		System.out.println("Enter the value for b");
		int b=value.nextInt();
		System.out.println("Enter the value for c");
		int c=value.nextInt();
		
		
		Ret2 obj=new Ret2();
		obj.add(a,b);
		obj.call(c);
		display();
		
	}
	static int add(int a,int b){
		int d=a*b;
		int e=a+b;
		System.out.println(e);
		return d;
	}
	void call(int c){
		
	    System.out.println(c);
		add(int a,int b);
	}
	static void display(){
		Scanner value2=new Scanner(System.in);
		System.out.println("Enter the value for c2");
		int c2=value2.nextInt();
		Ret2 obj=new Ret2();
		obj.call(c2);
		
	}
	
}