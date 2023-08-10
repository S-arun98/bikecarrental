class Merge2
{
	public static void main(String args[])
	{
		int a[]={20,30,40,50,60};
		int b[]={2,3,4,5,6};
		int c[]=new int[a.length+b.length];
		
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
			System.out.print(c[i]+" ");
		}
		for(int i=0;i<b.length;i++)
		{
			c[i]=b[i];
			System.out.print(c[i]+" ");
		}
		
	}
}
	