import java.util.Scanner;
class trial
{
	public static void main(String[] args)
	{
		int a=0,b=1,c=2;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter last term: ");
		int term = in.nextInt();

		for (int i=1; i<=term; i++)
		{
			System.out.print(a +" ");
			int d = a+b+c;
			a = b;
			b = c;
			c = d;
		}
	}
}