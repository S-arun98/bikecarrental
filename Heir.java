class A
{
	int a=84,b=65;
	int add()
	{
		System.out.println(a+b);
		return a+b;
	}
	void sub()
	{
		System.out.println(a-b);
	}
}
class B extends A
{
	int c=43;
	void multi()
	{
		System.out.println(a*b);
		System.out.println(c);
		
	}
}
class C2 extends A
{
	public static void main(String args[])
	{
		C2 obj= new C2();
		obj.sub();
		obj.add();
		
		B obj2= new B();
		obj2.multi();
		obj2.add();
		obj2.sub();
		
		
	}
}