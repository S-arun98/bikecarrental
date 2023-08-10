class A
{
	void add(int a,int b)
	{
		System.out.println(a+b);
	}
	void add(int a,int b,float c)
	{
		System.out.println(a+b+c);
	}
}
class B extends A
{
	void add(int a,int b)
	{
		System.out.println(a-b);
	}
	public static void main(String args[])
	{
		B obj=new B();
		obj.add(30,22);
		obj.add(34,56,23.3f);
	}
}