import java.util.Scanner;
class trial
{
	public static void main(String[] args)
	{
		int fact = 1;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter factotial: ");
		int n = in.nextInt();

		for (int i=1; i<=n; i++)
		{
			fact*=i;
		}
		System.out.print(fact);
	}
}