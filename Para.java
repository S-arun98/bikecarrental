class Para
{
	int a=54;
	Para()
	{
		System.out.println(a);
	}
	Para(String b)
	{
		this();
		System.out.println(b);
	}
	Para(int c,int d)
	{
		this("uniq");
		System.out.println(c+d);
	}
	Para(int e,String f)
	{
		this(45,65);
		System.out.println(e+f);
	}
	public static void main(String args[])
	{
		Para obj=new Para(45,"Arun");
	}
}