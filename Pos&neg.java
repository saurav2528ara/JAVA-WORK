import java.util.Scanner;
class trial
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter integer: ");
		int n = in.nextInt();

		String a = (n >= 0) ? "Positive" : "Negative";
		System.out.print(a);
	}
}