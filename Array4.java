class Array4
{
public static void main(String args[])
{
	int b[]={22,33,45,56,63,75,82,93};
	int even=0;
	int odd=0;
	int teven=0;
	int todd=0;
for(int i=0;i<b.length;i++)
{
	if(b[i]%2==0)
	{
		System.out.println(b[i] +" is even number");
		even+=1;
		teven+=b[i];
	}
}
	System.out.println(" ");
for(int i=0;i<b.length;i++)
{
	if(b[i]%2!=0)
	{
		System.out.println(b[i] +" is odd number");
		odd+=1;
		todd+=b[i];
		
	}
}
	System.out.println(" ");
	
	System.out.println("The total even numbers are :" + even);
	System.out.println(" ");
	System.out.println("The total odd numbers are :" + odd);
	System.out.println(" ");
	System.out.println("The sum of even numbers are :" + teven);
	System.out.println(" ");
	System.out.println("The sum of odd numbers are :" + todd);
	System.out.println(" ");
}
}