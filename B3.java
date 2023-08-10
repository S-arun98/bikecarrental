
class Stbind
{
		int a=10;
		void add()
		{
			System.out.println("Hi");	
		}
}
class B3 extends Stbind
{
		int a=20;
		void add()
		{
			System.out.println("welcome");
		}
	public static void main(String args[])
	{
		Stbind obj=new B3();
		System.out.println(obj.a);
		obj.add();
	}
		
}
