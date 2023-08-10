abstract class Abs
{
	void contact()
	{
		System.out.println("Save the number");
	}
	abstract void add();
	abstract void insertsim();
	void msg()
	{
		System.out.println("text msg");
	}
}	
	abstract class mobile2 extends Abs
	{
		void add()
		{
			System.out.println("Whatsapp");
		}
	}
	class mobile3 extends mobile2
	{
		void insertsim()
		{
			System.out.println("insert sim");
		}
		public static void main(String args[])
		{
			mobile3 obj=new mobile3();
			obj.msg();
			obj.insertsim();
			obj.contact();
		}
	}
