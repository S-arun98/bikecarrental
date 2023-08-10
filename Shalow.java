class Shalow
{
	int a;
	Shalow(int a)
	{
		this.a=a;
		System.out.println(a);
	}
}
class B
{
	public static void main(String args[])
	{
		Shalow obj=new Shalow(7);
		Shalow obj2=obj;
	}
}