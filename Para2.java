class A
{
	int a=54;
	A()
	{
		this("uniq");
		System.out.println(a);
		
	}
	A(String b)
	{
		System.out.println(b);
	}
	
}
class A2 extends A
{
	A2()
	{
		System.out.println(a+a);
	}
	A2(int c,String d)
	{
		this();
		System.out.println(c+d);
	}
	public static void main(String args[])
	{
		A2 obj=new A2(54," Arun");
	}
}