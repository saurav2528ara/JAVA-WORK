
class InvalidAgeException extends Exception
{
	InvalidAgeException(String m)
	{
		System.out.println(m);
	}
}
class trial
{
	public static void main(String[] args) 
	{	
		try 
		{
			vote(13);
		}
		catch(Exception n)
		{
			System.out.println(n);
		}
	}
	public static void vote(int age) throws InvalidAgeException
	{
		if(age<18)
		{
			throw new InvalidAgeException("Not eligible for vote");
		}
		else 
		{
			System.out.println("eligible for vote");
		}
	}
}