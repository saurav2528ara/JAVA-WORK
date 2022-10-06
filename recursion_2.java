class trial
{
	public static void main(String[] args)
	{
		trial in = new trial();
		int ans = in.add(3);
		System.out.print(ans);
	}
	int add(int a)
	{
		if (a > 0)
		{
			return a + add(a-1);
		}
		else
		{
			return 0;
		}
	}
}