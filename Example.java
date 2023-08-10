public class Example{
	int a=50;
	static int b=30;
	int d;
	void add(){
		int f=10;
		int g=f+a+b;
		System.out.println(g);
	}
	static void sub(){
		Example obj=new Example();
		int y=b-(obj.a);
		System.out.println(y);
	}
	public static void main(String args[]){
		Example obj=new Example();
		obj.add();
		sub();
		System.out.println(b);
		System.out.println(obj.d);
		System.out.println(obj.a);
		
	}
}