import java.util.Scanner;
class Array3
{
	public static void main(String args[])
	{
		int b[]=new int[6];
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the 6 values to assign");
		b[0]=obj.nextInt();
		b[1]=obj.nextInt();
		b[2]=obj.nextInt();
		b[3]=obj.nextInt();
		b[4]=obj.nextInt();
		b[5]=obj.nextInt();
		
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
	}
}