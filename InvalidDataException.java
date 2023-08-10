class InvalidDataException extends Exception 
{

	public InvalidDataException(String str)
	{
		super(str);
	}
}
class Arun
{
	static void age(int s)
	{
		if(s<18)
		{
			throw new InvalidDataException("Enter valid data");
		}
		else
		{
			System.out.println("Welcome");
		}
	}
	public static void main(String[] args) 
{
	try
	{
		age(25);
	}
	catch(InvalidDataException e)
	{
		System.out.println("You are entering wrong data");
		System.out.println("Sorry");
	}

}
}

