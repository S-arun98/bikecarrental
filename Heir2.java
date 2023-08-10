class A
{
	int b=10;
	void add()
	{
		System.out.println(b);
		System.out.println("Hi");
	}
}
class B extends A
{
	int b=30;
	void sub()
	{
		int b=40;
		System.out.println(b);
	}
}
class C extends A
{
	int b=43;
	void call()
	{
		int b=50;
		System.out.println(b);
	}
	public static void main(String args[])
	{
		C obj=new C();
		obj.call();
		obj.add();
		System.out.println(obj.b);
	}
} 