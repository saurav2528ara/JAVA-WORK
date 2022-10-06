// input number 121 --> 121 both side same
import java.util.Scanner;
class trial
{
	public static void main(String[] args)  
	{
		int sum = 0;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number to palindrome: ");
		int n = in.nextInt();
		int c;
		c = n;


		while (n > 0)
		{
			int a = n%10;
			sum = (sum*10)+a;
			n = n/10;
		}
		if (c == sum)
			System.out.print("palindrome");
		else 
		{
			System.out.print("not palindrome");
		}
	}	
}