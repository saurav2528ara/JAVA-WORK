import java.util.Scanner;
class trial
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter integer to perform: ");
		int a = in.nextInt();
		System.out.print("Enter sec integer to perform: ");
		int b = in.nextInt();

		System.out.println("Sum is :"+(a<b));
		System.out.println("Sum is :"+(a>b));
		System.out.println("Sum is :"+(a==b));
		System.out.println("Sum is :"+(a<=b));


	}
}