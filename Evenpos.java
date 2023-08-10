class Evenpos
{
	public static void main(String args[])
	{
		int a[]={32,55,26,43,72,47,84,46,89,30};
		int evenposition[]=new int[a.length];
		int oddposition[]=new int[a.length];
	
		System.out.println(" ");
		System.out.print("Even index position values are :");
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
			{
			evenposition[i]=a[i];
			}
		}
		System.out.println(" ");
		System.out.println(" ");
		System.out.print("Odd index position values are :");
		for(int i=0;i<a.length;i++)
		{
			if(i%2!=0)
			{
			oddposition[i]=a[i];
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(evenposition[i]+ " ");
			System.out.print(oddposition[i]+ " ");
		}			
		System.out.println(" ");
	}
}