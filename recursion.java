import java.util.Scanner;
class trial
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter any number: ");
		int n = in.nextInt();
		trial obj = new trial();
		int ans = obj.fact(n);
		System.out.print(ans);
	}
	int fact(int n)
	{
		if (n == 1)
		{
			return 1;
		}
		else
		{
			return n*fact(n-1);
		}
	}
}