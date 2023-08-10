class A
{
	int a=32;
	int b=23;	
	void add()
	{
		
		System.out.println(a+b);
		this.sub();	
		
	}
	void sub()
	{
		this.A(65,"uniq");
		System.out.println(a-b);
	}	
	 void A(int e,String f)
	{
		this.A2(35,45);
		System.out.println(e+f);
	}
    void A2(int c,int d)
	{
		
		System.out.println(c+d);
	}
}	
	class B extends A
{
		B(String s)
		{
			
			
			this.add();
			System.out.println(s);
			
		}
		public static void main(String args[])
		{
			B obj=new B("Arun");
		}
}
