class Mularray
{
	public static void main(String args[])
	{
		int r=3;
		int c=3;
		int a[][]=new int[r][c];
		int count=0;
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=count;
				count++;
			}
		}	
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
		{
			System.out.print(a[i][j]+"  ");
		
		}
		System.out.println();
		System.out.println();
	}
}
}