import java.util.Scanner;
class trial
{
	public static void main(String[] args)
	{
		char ch2;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Character: ");
		char ch = in.next().charAt(0);

		if (ch >= 'A' && ch <= 'Z')
		{
			ch2 = Character.toLowerCase(ch);
			System.out.print("LowerCase: " + ch2);
		}
		else
		{
			ch2 = Character.toUpperCase(ch);
			System.out.println("UpperCase: " + ch2);
		}
	}
}