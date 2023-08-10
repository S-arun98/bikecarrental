public class Maths3{
	public static void main(String args[]){
		Maths3 arithmetic=new Maths3();
		arithmetic.add();
		arithmetic.sub();
		arithmetic.multi();
		arithmetic.div();
	}
	public void add(){
		int a=80,b=40;
		int c=a+b;
		System.out.println("Add value for c is " + c);
	}
	public void sub(){
		int a=80,b=40;
		int d=a-b;
		System.out.println("sub value of d is "+ d);
	}
	public void multi(){
		int a=80,b=40;
		int e=a*b;
		System.out.println("multiplication value of e is "+ e);
	}
	public void div(){
		int a=80,b=40;
		int f=a/b;
		System.out.println("division value of f is "+ f);
	}
}