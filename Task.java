interface A
{
	void add();
	void sub();
	void multi();
	void div();
	int h=20;
}
interface A2
{
	void dec();
	int h=53;
}
abstract class B implements A
{
	static int a=43;
	static int b=24;
	public void add()
	{
		System.out.println(a+b);
		System.out.println(h);
	}
	public void sub()
	{
		System.out.println(a-b);
	}
	B()
	{
		System.out.println(a);
		System.out.println(b);
	}
}
class C extends B
{
	public void multi()
	{
		System.out.println(a*b);
	}
	public void div()
	{
		System.out.println(a/b);
	}
	C(int c,String e)
	{
		System.out.println(c+e);
	}
	public static void main(String args[])
	{
		C obj=new C(84," Arun");
		obj.add();
		obj.sub();
		obj.multi();
		obj.div();
	}
}