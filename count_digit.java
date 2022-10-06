import java.util.Scanner;
class trial
{
	public static void main(String[] args)
	{
		int count = 0;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = in.nextInt();

		while (n > 0)
		{
			n/=10;
			count++;
		}
		System.out.print("no of digit: " + count);

	}
}