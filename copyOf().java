import java.util.Scanner;
import java.util.Arrays;
class trial
{
	public static void	main(String[] args)
	{
		int arr[] = new int[5];
		Scanner in = new Scanner(System.in);
		System.out.print("Enter array 1: ");
		for (int i=0; i<arr.length; i++)
		{
			arr[i] = in.nextInt();
		}
		int arr2[] = Arrays.copyOf(arr,5);
		System.out.print("Data in array 2: ");
		
		for (int i=0; i<arr.length; i++)
		{
			System.out.print(arr2[i]+" ");
		}
	}
}