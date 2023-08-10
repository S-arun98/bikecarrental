interface A
{
	void add();
	void sub();
	int b=20;
}
abstract class B implements A
{
	void call()
	{
		System.out.println("Hi");
	}
	public void sub()
	{
		System.out.println("Hello");
		System.out.println(b);
	}
}
class C extends B
{
	public void add()
	{
		System.out.println("Super");
	}
	public static void main(String args[])
	{
		int d=30;
		C obj=new C();
		obj.add();
		obj.sub();
		System.out.println(d+obj.b);
	}
}