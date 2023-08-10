
class Deep implements Cloneable 
{
	Deep(int a,int b)
	{
		System.out.println(b);
	}
	public Object clone()
	{
		return clone();
	}
	public static void main(String args[])
	{
		Deep ob=new Deep(35,92);
		Deep obj=ob;
		Deep obj1=new Deep(ob);
	}
}
