import java.util.Scanner;
class Merge
{
	public static void main(String args[])
	{

	Scanner obj=new Scanner(System.in);
	System.out.println("Enter the length of the array a");
	int k=obj.nextInt();
	System.out.println("Enter the length of the array b");
	int l=obj.nextInt();
	int a[]=new int[k];
	int b[]=new int[l];
	int arr[]=new int[k];
	int brr[]=new int[l];
	int z=k+l;
	
	for(int i=0;i<k;i++)
	{
		for( i=0;i<k;i++)
	{
		System.out.println("Enter the value for a");
		a[i]=obj.nextInt();
		arr[i]=a[i];
	}
	}
	for(int i=0;i<l;i++)
	{
		for( i=0;i<l;i++)
	{
		System.out.println("Enter the value for b");
		b[i]=obj.nextInt();
		brr[i]=b[i];
		
	}
	}
	for(int i=0;i<=10;i++)
	{
	for(i=0;i<=10;i++)
	{	
	System.out.print(arr[i]+","+brr[i]);
	}
	}
}
}