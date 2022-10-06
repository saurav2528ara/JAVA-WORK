// input number 121 --> 121 both side same
import java.util.Scanner;
class trial
{
	public static void main(String[] args)  
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter no to find sqrt: ");
		int n = in.nextInt();

		double m = Math.sqrt(n);
		System.out.print(m);
		
	}	
}