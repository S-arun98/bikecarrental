class Loop
{
public static void main(String args[])
 {
	 int count=0;
	for(int i=1;i<=30;i++)
	{
		if(i%5==0)
		{
		count+=1;	
		System.out.println(i);
		}
	}
       System.out.println("The number of counts are " + count); 
 }	
}