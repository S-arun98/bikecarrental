class Str
{
	public static void main(String args[])
	{
	String a="Arun";
	String b="Hi";
	String c="Arun";
	
	System.out.println(a.toUpperCase());
	System.out.println(a.toLowerCase());
	System.out.println(a.isEmpty());
	System.out.println(a.length());
	System.out.println(a.substring(2,4));
	System.out.println(a.equals(c));
	System.out.println(a.startsWith("A"));
	System.out.println(a.startsWith("n"));
	System.out.println(a.charAt(2));
	System.out.println(a.concat(b));
	System.out.println(a.compareTo(b));
	
	
	}
}