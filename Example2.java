class Example2
{
	int d;
	int S;
	String name;
	public Example2(int d)
	{
		System.out.println(d);
	}
	public Example2(int r,int s)
	{
		d=r;
		System.out.println(r);
	}
	public Example2(String name,int d)
	{
		System.out.println(name);
	}
public static void main(String args[])
{
	Example2 ob=new Example2(68);
	Example2 obj=new Example2(30,45);
	Example2 obj2=new Example2("St",45);
}
}