class InvalidDataException extends Exception 
{

	InvalidDataException(String a)
	{
		super(a);
	}
}
class Arun
{
	static void age(int s) throws InvalidDataException
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
		age(5);
	}
	catch(InvalidDataException e)
	{
		System.out.println("You are entering wrong data");
		System.out.println("Sorry");
	}

}
}

