class Thisa
{
	int e;
	Thisa()
	{
		System.out.println("Hi");
	}
	Thisa(String S)
	{
		this.e=43;
		System.out.println(e);
		System.out.println(S);
	}
	Thisa(int d,int e)
	{
		this("uniq");
		System.out.println(d+e);
	}
	public static void main(String args[])
	{
		Thisa obj=new Thisa();
		Thisa obj2=new Thisa("Arun");
		Thisa obj3=new Thisa(45,54);
		
	}
}