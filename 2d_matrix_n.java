import java.util.Scanner;
class trial
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int arr[][] =  new int[2][2];
		System.out.print("Enter array element: ");

		for (int i=0; i<2; i++)
		{
			for (int j=0; j<2; j++)
			{
				arr[i][j] = in.nextInt();
			}
		}
		System.out.println("matrix: ");
		for (int i=0; i<2; i++)
		{
			for (int j=0; j<2; j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.print("\n");
		}
	}
}