class A
{
	static void add(int a)
	{
		System.out.println(a);
	}
	void add(int a,int b)
	{
		System.out.println(a+b);
	}
}
class B extends A
{
	void add(int a,int b)
	{
		System.out.println(a-b);
	}
	void add(String c,int a,int b)
	{
		System.out.println(c+(a+b));
	}
}
class C
{
	public static void main(String args[])
	{
		B obj=new B();
		obj.add(50,32);
		obj.add("Arun",34,52);
		A obj2=new A();
		obj2.add(56);
		obj2.add(56,52);
	}
}