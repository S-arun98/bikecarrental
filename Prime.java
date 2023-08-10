class Prime
{
	public static void main(String args[])
	{
	int pcount=0;
	int npcount=0;
	int i;
	
 for(i=1;i<=90;i++)
 {
	 if((i%i==0)&&(i%1!=0))
	 {
		System.out.println(i + "is a prime number"); 
		pcount=pcount+1;
	 }
 }
 for(i=1;i<=90;i++)
 {
	 if((i%i!=0)&&(i%1!=0))
	 {
		System.out.println(i + "is a not prime number"); 
		npcount=npcount+1;
	 }	 
 }
		System.out.println("total number of prime numbers in between 0 to 90 is :" + pcount);
		System.out.println("total number of non-prime numbers in between 0 to 90 is :" + npcount);
	}
}