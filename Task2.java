import java.util.Scanner;
class School
{
	private int s1,s2,s3,s4,s5;
	int tot;
	double avg;
	public void marks(int s1,int s2,int s3,int s4,int s5)
	{
		this.s1=s1;
		this.s2=s2;
		this.s3=s3;
		this.s4=s4;
		this.s5=s5;	
	}
	public int total()
	{

		tot=s1+s2+s3+s4+s5;
		return tot;
	}
	public double average()
	{
		avg=tot/5;
		return avg;
	}
	public void grade()
	{
	if(tot>=450)
	{
		System.out.println("grade A");
	}
	else if(tot>=400)
	{
		System.out.println("grade B");
	}
	else if(tot>=350)
	{
		System.out.println("grade C");
	}
	else if(tot>=300)
	{
		System.out.println("grade D");
	}
	else if(tot>=250)
	{
		System.out.println("grade E");
	}
	}
}
class B extends School
{
	public static void main(String ar[])
	{
		int ss1,ss2,ss3,ss4,ss5;
		B ob=new B();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter S1 mark:");
		ss1=sc.nextInt();
		System.out.println("Enter S2 mark:");
		ss2=sc.nextInt();
		System.out.println("Enter S3 mark:");
		ss3=sc.nextInt();
		System.out.println("Enter S4 mark:");
		ss4=sc.nextInt();
		System.out.println("Enter S5 mark:");
		ss5=sc.nextInt();
		
		ob.marks( ss1,ss2, ss3, ss4,ss5);
		System.out.println("your total is   :"+ob.total());
		System.out.println("your avg is    :"+ob.average());
		ob.grade();
		
	}
	
}