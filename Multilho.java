class A
{
	int a=34,b=65;
	void add()
	{
		System.out.println(a+b);
	}
	void sub()
	{
		System.out.println(a-b);
	}
}
class B extends A
{
	int c=43;
	void multi()
	{
		System.out.println(a*b);
		System.out.println(c);
		
	}
}
class C extends B
{
	public static void main(String args[])
	{
		C obj= new C();
		obj.multi();
		obj.sub();
		obj.add();
		
	}
}