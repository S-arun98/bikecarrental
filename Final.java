class A
{
	int a=45;
	final static int b=53;
	int c=4;
	
	void add()
	{
		System.out.println(a+b+c);
	}
	void add2()
	{
		a=32;
		System.out.println(a+"+"+b);
	}
}
class B extends A
{
	void sub()
	{
		System.out.println(a+c);
		System.out.println(b);
	}
	void multi()
	{
		int b=23;
		System.out.println(b);
	}
	public static void main(String args[])
	{
		B obj=new B();
		obj.add();
		obj.add2();
		obj.sub();
		obj.multi();
	}
	
}