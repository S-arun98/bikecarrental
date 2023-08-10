import java.util.Scanner;
class School
{
	private int t,e,m,s,ss;
	int total,average;
	
	public void Setmark(int t,int e,int m,int s,int ss)
	{
		this.t=t;
		this.e=e;
		this.m=m;
		this.s=s;
		this.ss=ss;
	}
	public int Gettotal()
	{
		total=t+e+m+s+ss;
		return total;
	}
	public double Getaverage()
	{
		average=total/5;
		return average;
	}
	public void Grade()
	{
		if(total>=450)
		{
			System.out.println("Grade A");
		}
		else if(total>=350 && total<450)
		{
			System.out.println("Grade B");
		}
		else if(total>=250 && total<350)
		{
			System.out.println("Grade C");
		}
	}
}
class A extends School
{
	public static void main(String args[])
	{
		
	int t,e,m,s,ss;
	A obj=new A();
	Scanner obj2=new Scanner(System.in);
	System.out.println("Enter the tamil mark ,T :");
	t=obj2.nextInt();
	System.out.println("Enter the English mark ,E :");
	e=obj2.nextInt();
	System.out.println("Enter the Maths mark ,M :");
	m=obj2.nextInt();
	System.out.println("Enter the Science mark ,S :");
	s=obj2.nextInt();
	System.out.println("Enter the Social science mark ,SS :");
	ss=obj2.nextInt();
	obj.Setmark(t,e,m,s,ss);
	System.out.println(" ");
	System.out.println("Total mark the Student is : " + obj.Gettotal() + "/500");
	System.out.println("Average Score of the student is :" + obj.Getaverage() + "/100");
	obj.Grade();
	}
}