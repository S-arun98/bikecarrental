
public class Operation
{
	int square(int r)
	{
		return r*r;
	}
}
class Circle
{
	double pi=3.14;
	double area()
	{
		Operation op=new Operation();
		double rsquare=op.square(5);
		return pi*rsquare;
	}
	public static void main(String args[])
	{
		Circle obj=new Circle();
		System.out.println(obj.area());
	}
	
}