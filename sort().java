import java.util.Scanner;
import java.util.Arrays;
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
		Arrays.sort(arr);
		for (int i =0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}