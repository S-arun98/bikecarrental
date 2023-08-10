class A
  {
	int a=43;
	static int b=32;
 void add()
    {
	 int c=32;
	 System.out.println(a+b+c);
	 B obj=new B();
	 obj.call();
    }
 static void sub()
    {
	 A obj=new A();
	 int d=obj.a+b;
	 System.out.println(d);
	 obj.add();
    }	 
  }
class B
{
	void call()
	{
		System.out.println(A.b);
	}
public static void main(String args[])
 {
	A obj2=new A();
	obj2.add();
	A.sub();
	B obj3=new B();
	obj3.call();
 }
}