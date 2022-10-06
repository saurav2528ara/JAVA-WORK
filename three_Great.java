import java.util.Scanner;
class trial
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter three number: ");
		int a = in.nextInt();
		System.out.print("Enter three number: ");
		int b = in.nextInt();
		System.out.print("Enter three number: ");
		int c = in.nextInt();

		int max = (a > b) ? (a > c ? a : b) : (b > c ? b : c);

		System.out.print(max);
	}
}