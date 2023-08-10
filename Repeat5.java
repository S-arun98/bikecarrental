class Repeat5
{
	public static void main(String args[])
	{
		int a[]={20,30,40,50,60};
		System.out.println(add(a,50));
		
	}	
		static String add(int a[],int b)
		{
			for(int c : a)
			{
				if(c==b)
					return "true";
			}
			
					return "false";
		
		}
}