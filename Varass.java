public class Varass{
	int a=46;
	static int b=65;
	public static void main(String args[]){
		Varass obj=new Varass();
		ass2();
		obj.ass3();
		ass4();
	}
	static void ass2(){
		Varass obj=new Varass();
		int c=65;
		int d=(obj.a)+b+c;
		System.out.println(d);
	}
    void ass3(){
		int e=a*a;
		System.out.println(e);
	}
	static void ass4(){
		Varass obj=new Varass();
		int f=b+(obj.a);
		System.out.println(f);
	}
}