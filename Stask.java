class Stask
{
	public static void main(String args[])
	{
		String a="Welcome";
		String b[]=a.split("");
		
		//for welcome program
		System.out.println(a.toCharArray());
		
		for(int i=b.length-1;i>=0;i--)
		{
			System.out.print(b[i]);
		}
		
		System.out.println("");
		
		String c="Java is a programming language";
		String d[]=c.split(" ");
		String rev="";
		//for java is a programming language 
		for(int i=0;i<d.length;i++)
		{
		rev=d[i]+" "+rev;	
		}
		System.out.println(rev);
		
		String e[]=rev.split("");
		for(int i=e.length-1;i>=0;i--)
		{
			System.out.print(e[i]);
		}
		
		System.out.println("");
		String f[]=c.split("");
		for(int i=f.length-1;i>=0;i--)
		{
			System.out.print(f[i]);
		}
	}
}