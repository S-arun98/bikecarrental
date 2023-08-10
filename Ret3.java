import java.util.Scanner;
public class Ret3{
	public static void main(String args[]){
		
		Ret3 obj=new Ret3();
		obj.add(43,23);
		obj.call(43,43);
		display();
	}
	int add(int a,int b){
		System.out.println(a+b);
		return a*b;
	}
	void call(int c,int d){
		int f=c+d;
	    System.out.println(f);
		
	}
	static void display(){
		Ret3 ob=new Ret3(); 
		ob.call(43,43);
		
	}
}