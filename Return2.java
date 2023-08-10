public class Return2{
	static int c=86;	
	static int d=43;
	
	static int Add(){
		int a=45,b=89;
		return a+b;
	}
	static void Sub(){
		System.out.println(c);
	}
	static int Multi(){
		return c+d;
	}
	public static void main(String args[]){
		Return2 obj=new Return2();
		System.out.println(Add());
		Sub();
		System.out.println(Multi());
		
		
		
		
		
		
		
	}
	
}