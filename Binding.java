class Binding
{
	void add()
	{
		System.out.println("Hi");
	}
}
class B extends Binding
{
	void add()
	{
		System.out.println("Hello");
	}
	public static void main(String args[])
	{
		Binding obj=new B();
		obj.add();
		
	}
}