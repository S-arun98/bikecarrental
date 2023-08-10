class Equal
{
	public static void main(String args[])
	{
	String a[]={"a","e","i","o","u"};
	String c="e";
	
	int index=0;
	for(String b : a)
	{
		//here i am using equals method
		if(c.equals(b))
		{	
		System.out.println("this value "+ c +" is present in the array with index value: "+ index);	
		}
		else
		{
		System.out.println("this value "+ c +" is  not present in the array with index value"+index);
		}
		index++;
	}
	}
}