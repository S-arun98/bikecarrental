import java.util.Scanner;
class Skip
{
	public static void main(String args[])
	{
		String a="Java is a programming language";
		String result="";
		
		for(int i=0;i<=a.length()-1;i++)
		{
			if(result.indexOf(a.charAt(i))==-1)
			{
				result+=a.charAt(i);
			}
		}
		System.out.print("The unrepeatd characters are :"+result);
	}
}