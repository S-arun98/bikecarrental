class A
{
	int a=45;
	String b="Arun";
	int c=52;
	
	void add()
	{
		System.out.println(a+c);
	}
	void sub()
	{
		System.out.println(b);
	}
}
class B extends A
{
	String b="uniq";
	void multi()
	{
		int c=32;
		
		System.out.println(c);
		System.out.println((a)*(super.c));
	}
	void divs()
	{
		System.out.println(b);
		System.out.println(super.b);
	}
	public static void main(String args[])
	{
		B obj=new B();
		obj.add();
		obj.sub();
		obj.multi();
		obj.divs();
		
	}
}
