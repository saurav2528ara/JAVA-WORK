class String_Reverses
{
	public static void main(String[] args)
	{
		StringBuffer in = new StringBuffer("Learn Saurav");
		System.out.print(in.reverse());

		StringBuilder r = new StringBuilder("Learn Saurav");
		System.out.println(r.reverse());


		// With Logic

		String r= "Saurav";
		String r2 = "";
		int l = r.length();

		for (int i=l-1; i>=0; i--)
		{
			r2 = r2+r.charAt(i);
		}
		System.out.print(r2);
	}
}