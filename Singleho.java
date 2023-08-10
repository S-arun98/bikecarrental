class A
{
	static int a=20,b=32;
	void add()
	{
		System.out.println(a+b);
	}
}
class B extends A
{
	void sub()
	{
		System.out.println("Hi, How r u doing?");
		int a=30;
		System.out.println(a);
	}	
}
class Singleho
{
	public static void main(String args[])
	{
		B obj=new B();
		obj.sub();
		obj.add();
	}
}
