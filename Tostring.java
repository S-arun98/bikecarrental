class A
{
String s,c;
String e;

A(String s)
{
	this.s=s;
}

A(String c,String e)
{
	this.c=c;
	this.e=e;
}
public String toString()
{
	return s;
}

public static void main(String args[])
{
	A obj=new A("Arun");
	A obj2=new A("Hi","Welcome");
	System.out.println(obj);
	System.out.println(obj2.toString());
}
}