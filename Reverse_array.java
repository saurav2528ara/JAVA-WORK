import java.util.Scanner;
class trial
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int size = in.nextInt();
		int arr[] = new int[size];
		System.out.print("Enter array: ");
		for (int i=0; i<size; i++)
		{
			arr[i] = in.nextInt();
		}
		for (int i=0; i<size; i++)
		{
			System.out.println(arr[i]);
		}
		for (int i=4; i>=0; i--)
		{
			System.out.println("Reverse Array: "+ arr[i]);
		}

	}
}