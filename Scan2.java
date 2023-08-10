import java.util.Scanner;
public class Scan2{
	public static void main(String args[]){
		Scanner obj2=new Scanner(System.in);
		System.out.println("Enter the value for a");
		int a=obj2.nextInt();
		System.out.println("Enter the value for b");
		int b=obj2.nextInt();
		System.out.println("Enter the String value for d");
		String d=obj2.next();
		Scan2 obj=new Scan2();
		obj.add(a,b);
		sub(d);
	}
	void add(int a,int b){
		int c=a*b;
		System.out.println(c);
	}
	static void sub(String d){
		System.out.println(d);
	}
}