import java.util.Scanner;
class trial
{
	public static void main(String[] args)
	{
		int size;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter size: ");
		size = in.nextInt();
		int arr[] = new int[size+1];
		System.out.print("Enter array: ");
		for (int i=0; i<size; i++)
		{
			arr[i] = in.nextInt();
		}
		System.out.print("Enter location: ");
		int loc = in.nextInt();
	
		for (int i=loc; i<size-1; i++)
		{
			arr[i] = arr[i+1];
		}
		size--;

		for (int i=0; i<size; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}