class Break
{
public static void main(String args[])
{
	for(int i=1;i<=50;i++)
	{
		if(i%6==0)
		{
			continue;
		}
		System.out.println(i);
	}
}	
}