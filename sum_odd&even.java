import java.util.Scanner;
class trial
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter no of term: ");
		int n = in.nextInt();
		int sum = 0;

		if (n % 2 == 0)
		{
			for (int i=1; i<=n; i+=2)
			{
		     	sum+=i;				
	     	}
			System.out.print(sum);
		}	
		else
		{
			for(int i=0; i<n; i+=2)
			{
				sum+=i;
			}
			System.out.print(sum);
		}
	}
}