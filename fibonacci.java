import java.util.Scanner;
class trial
{
	public static void main(String[] args)
	{
		int a = 0;
		int b = 1;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter term: ");
		int term = in.nextInt();
		for (int i=1; i<=term; i++)
		{
			System.out.print(a + " ");
			int c = a+b;
			a = b;
			b = c;
		}
	}
}