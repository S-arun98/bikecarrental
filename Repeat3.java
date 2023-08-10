public class Repeat3
{
public static void main(String args[])
{
//String a=;
// b="";
StringBuffer c=new StringBuffer("hi##wel#come");
//int count=0;
	for(int i=0;i<c.length();i++)
	{
		if(a.charAt(i)=='#')
		{
			c.delete(charAt(i)).delete(charAt(i+1));
		}
	}
	System.out.println(c.toString());
}
}
