import java.util.Scanner;
class trial
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Character: ");
		int ch = in.next().charAt(0);

		System.out.print(ch);
	}
}