import java.util.Scanner;
class trial
{
	public static void main(String[] args)
	{
		
		int sum = 0;
		double avg;
		Scanner in = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.print("Enter array: ");

		for (int i=0; i<arr.length;i++)
		{
			arr[i] = in.nextInt();
		}
		System.out.println("Array element: ");
		for ( int i=0; i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
		System.out.print("Average is: ");
		for (int i=0; i<arr.length; i++)
		{
					sum = sum+arr[i];		
		}
		avg = sum/5.0;

		
		System.out.print(avg);
	}
}