class Star4
{
	
	public static void main(String args[])
	{
		int i,j,k;
	for(i=1;i<=4;i++)
	{
		for(j=1;j<=4-i;j++)
		{
		System.out.print(" ");
		}
		for(k=1;k<=(2*i)-1;k++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	for(i=3;i>=1;i--)
	{
		System.out.print(" ");
		for(j=1;j<=3-i;j++)
		{
		System.out.print(" ");
		}
		for(k=(2*i)-1;k>=1;k--)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	}
}