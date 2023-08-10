class A
{
A()
{
	System.out.println("Hi");
}
void add()
{
	System.out.println("Hello");
}
}
class B extends A
{
	B()
	{
		System.out.println("super");
	}
	public static void main(String args[])
	{
		B obj=new B();
		obj.add();
	}
}