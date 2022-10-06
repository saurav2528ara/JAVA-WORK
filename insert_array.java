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
		System.out.print("Enter new element: ");
		int n_element = in.nextInt();

		for (int i=size; i>loc; i--)
		{
			arr[i] = arr[i-1];
		}
		arr[loc] = n_element;
		size++;

		for (int i=0; i<size; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}