class A
{
	public A()
	{
		int a=34;
		System.out.println(a);
	}
	public A(int b,String c)
	{
		System.out.println(b+c);
	}
}
class B extends A
{
	public B(int b,String c)
	{
		System.out.println(b+c);
	}
	
}
class C
{
	public static void main(String args[])
	{
		B obj=new B(45," Arun");
		A obj2=new A();
		A obj3=new A(34," Serve");
	}
}