class Mergerev
{
	public static void main(String args[])
	{
		int a[]={20,30,40,50,60};
		int b[]={2,3,4,5,6};
		int len=a.length+b.length;
		int c[]=new int[len];
		int merge=0;
		
		for(int i=0;i<a.length;i++)
		{
			c[merge]=a[i];
			merge++;
		}
		for(int i=0;i<b.length;i++)
		{
			c[merge]=b[i];
			merge++;
		}
		System.out.print("{");
		for(int i=c.length-1;i>=0;i--)
		{
			System.out.print(c[i]+" ");
			
		}
		System.out.print("}");
	}
}