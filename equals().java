import java.util.Scanner;
import java.util.Arrays;
class trial
{
	public static void	main(String[] args)
	{
		int arr[] = new int[5];
		int arr2[] = new int[5];
		Scanner in = new Scanner(System.in);
		System.out.print("Enter array 1: ");
		for (int i=0; i<arr.length; i++)
		{
			arr[i] = in.nextInt();
		}
		System.out.print("Enter array 2: ");
		for (int i=0; i<arr2.length; i++)
		{
			arr2[i] = in.nextInt();
		}
		boolean b = Arrays.equals(arr,arr2);
		System.out.print(b);
	}
}