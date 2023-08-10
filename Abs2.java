abstract class Abs2
{
	int a=44,b=23;
	abstract void add();
	abstract void sub();
	void multi()
	{
		System.out.println(a*b);
	}	
	Abs2()
	{
		this.multi();
		
		System.out.println(a-b);
	}
}
abstract class A extends Abs2
{
	void add()
	{
		System.out.println(a+b);
	}
	A()
	{
		this(65," Arun");
		this.add();
		System.out.println(b-a);
	}
	A(int c,String d)
	{
		System.out.println(c+d);
	}
}
abstract class B extends A
{
	void sub()
	{
		System.out.println(a-b);
	}
	abstract void divi();
	void balance()
	{
		System.out.println((a+b)-(a-b));
	}
}
class D extends B
{
	void divi()
	{
		System.out.println(a/b);
	}
	public static void main(String args[])
	{
		D obj=new D();
		obj.sub();
		obj.balance();
		obj.divi();
	}
}