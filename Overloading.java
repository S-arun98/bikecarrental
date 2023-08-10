class A
{
	void add(int a,int b)
	{
		System.out.println(a+b);
	}
}
class B
{
	void add(int b)
	{
			System.out.println(b);
	}
	public static void main(String args[])
	{
		A obj=new A();
		obj.add(20,30);
		B obj2=new B();
		obj2.add(45);
	}
}