import java.util.Scanner;
class A
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter integer: ");
		int a = in.nextInt();
		System.out.println("Enter integer: ");
		int b = in.nextInt();

		int temp = a;
		a = b;
		b = temp;
		System.out.println("After swap: "+a+" and "+b);

	}
}