class trial
{
	public static void main(String[] args)
	{
		String a="SAURAV";
		String b="priya";

		System.out.println(a.toLowerCase());
		System.out.println(b.toUpperCase());

		System.out.println(b.concat(a));
		System.out.println(b.length());

		String c = "     priya   ";
		String d = "";
		System.out.println(c.trim());
		System.out.println(d.isEmpty());

		System.out.println(b.charAt(2));
		System.out.println(a.indexOf('R'));

		System.out.println(b.equals(a));
		System.out.print(a.replace('A','P'));


	}
}