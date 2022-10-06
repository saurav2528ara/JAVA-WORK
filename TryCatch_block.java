		/*   NUll Pointer Exception  */
class trial
{
	public static void main(String[] args) {
		
		String str = null;

		try  // hold the main area where exception can be held
		{
			System.out.println(str.toUpperCase());
		}
		catch(NullPointerException n)
		{
			System.out.print("can't run");
		}
	}
}

			/*  Number format Exception */

class trial
{
	public static void main(String[] args) {
		
		String str = "123";

		try  
		{
			int a = Integer.parseInt(str);
			System.out.print(a);
		}
		catch(NumberFormatException n)
		{
			System.out.print("String "+str+"cant be converted");
		}
	}
}
			/*   Try-catch-finally   */

class trial
{
	public static void main(String[] args) {
		
		int a=20,b=0,c;
		try
		{
			c = a/b;
			System.out.println(c);
		}
		catch(ArithmeticException n)
		{
			System.out.println("can't divide by zero");
		}
		finally
		{
			System.out.println("all ok");
		}
	}
}

	/*  Multiple Try-Catch  */

class trial
{
	public static void main(String[] args) {
		
		int a=20,b=0,c;
		try
		{
			c = a/b;
			System.out.println(c);
		}
		catch(ArithmeticException n)
		{
			System.out.println("can't divide by zero");
		}
		try 
		{	
			int arr[] = {2,5,6,8};
			System.out.println(arr[4]);
		}
		catch(ArrayIndexOutOfBoundsException n)
		{
			System.out.print("Beyond the array");
		}
	}
}

	/*  Multiple catch Exception  */

class trial 
{
	public static void main(String[] args) {
		
		try 
		{
			int a = 10,b=0,c;
			c = a/b;
			System.out.println(c);

			int arr[] = {2,4,3,5};
			System.out.println(arr[4]);

			String str= null;
			System.out.println(str.toUpperCase());
		}
		catch(ArithmeticException n)
		{
			System.out.println("Arith");
		}
		catch(ArrayIndexOutOfBoundsException n)
		{
			System.out.println("Array");
		}
		catch(NullPointerException n)
		{
			System.out.println("Null pr");
		}
	}
}

		/*  Nested Try Block  */	

class trial
{
	public static void main(String[] args) {
		
	try 
	{
		try 
		{
			String str= null;
			System.out.println(str.toUpperCase());
		}
		catch(NullPointerException n)
		{
			System.out.println("null error");
		}
		int a=4,b=0,c;
		c = a/b;
		System.out.println(c);
	}
	catch(ArithmeticException e)
	{
		System.out.println("can't divide by zero");
	}	
	}
}

		/*  Nested Catch Block  */	

class trial
{
	public static void main(String[] args) {
		
		try 
		{
			System.out.println(4/0);
		}
		catch(Exception n)
		{
			try 
			{
				String str = null;
				System.out.println(str.toUpperCase());
			}
			catch(NullPointerException e)
			{
				System.out.print("can't divide by zero");
			}
	}	}

}