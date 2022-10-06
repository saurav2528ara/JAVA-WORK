		/*   NUll Pointer Exception  */
class trial
{
	public static void main(String[] args) {
		
		String str = null;

		try
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