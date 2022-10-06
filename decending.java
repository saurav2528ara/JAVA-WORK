import java.util.Scanner;
class trial
{
	public static void	main(String[] args)
	{
		int arr[] = new int[5];
		Scanner in = new Scanner(System.in);
		System.out.print("Enter array: ");
		for (int i=0; i<arr.length; i++)
		{
			arr[i] = in.nextInt();
		}
		for (int i=0; i<arr.length; i++)
		{
			for (int j=i+1; j<arr.length; j++)
			{
				if (arr[i] < arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i =0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}