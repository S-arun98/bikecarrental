public class Asret{
	int a=65;
	static int b=43;
	public static void main(String args[]){
		Asret obj=new Asret();
		add();
		obj.sub();
		call();
	}
	static int add(){
		int c=85;
		Asret obj=new Asret();
		return (obj.a)+b+c;
		
		
	}
	void  sub(){
		int d=54;
		int e=d-b;
		System.out.println(e);
		System.out.println(add());
	}
	static void call(){
		System.out.println(add());
	}
	
}