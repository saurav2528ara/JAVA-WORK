import java.util.Scanner;
class trial
{
	public static void main(String[] args)
	{
		int sum = 0;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number to reverse: ");
		int n = in.nextInt();

		while (n > 0)
		{
			int a = n%10;
			sum+=a;
			n = n/10;

		}
		System.out.print(sum);
	}
}