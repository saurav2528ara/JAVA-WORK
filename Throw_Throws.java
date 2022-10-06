class trial
{
	void div(int a, int b) throws ArithmeticException
	{
		if (b==0)
		{
			throw new ArithmeticException();
		}
		else 
		{
			int c = a/b;
			System.out.println(c);
		}
	}
	public static void main(String[] args) {
		trial in = new trial();
		try
		{
			in.div(8,0);
		}
		catch(Exception n)
		{
			System.out.println("can't divide by zero");
		}
	}

}