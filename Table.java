import java.util.Scanner;
class trial
{
	public static void main(String[] args)
	{

		int c;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter table: ");
		int n = in.nextInt();

		for (int i=1; i<=10; i++)
		{
			System.out.println(n+"*"+i+"="+n*i);			
		}

	}
}