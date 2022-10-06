import java.util.Scanner;
class trial
{
	public static void main(String[] args)
	{
		int result = 1;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter n: ");
		int a = in.nextInt();
		System.out.print("Enter Power: ");
		int p = in.nextInt();

		for (int i=1; i<=p; i++)
		{
			result*=a;
		}

		System.out.print(result);

	}
}