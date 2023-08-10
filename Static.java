class A
{
	static int a=39;
	static int b=42;
 static
 {
	System.out.println("Hi, Arun subramanian");	
 }
 int add()
 {
	 System.out.println("This is core java training");
	 System.out.println(a);
	 return a+b;
 }
 void sub()
 {
	 add();
 }
 public static void main(String args[])
 {
	 A obj=new A();
	 obj.sub();
	 System.out.println(obj.add());
	 
 }
}