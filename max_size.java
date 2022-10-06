import java.util.Scanner;
class trial
{
	public static void main(String[] args)
	{
		int arr[] = new int[5];
		Scanner in = new Scanner(System.in);
		System.out.print("Enter array: ");
		for (int i=0; i<arr.length; i++)
		{
			arr[i] = in.nextInt();
		}
		int max = arr[0];
		for (int i=0; i<arr.length; i++)
		{
			if (arr[i] > max)
			{
				max = arr[i];
			}
		}
		System.out.print("max size number: "+ max);
	}
}