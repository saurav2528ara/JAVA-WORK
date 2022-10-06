import java.util.Scanner;
class trial
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter no of term: ");
		int n = in.nextInt();

		for (int i=1; i<=n; i+=2)
		{
			System.out.print(i + " ");
		}
	}
}