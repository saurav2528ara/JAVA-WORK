import java.util.Scanner;
class for_each_loop
{
	public static void main(String[] args)
	{
		/*
		int arr[] = {10,20,30,40,50};

		for (int a : arr) // For each loop , fetch one by one

		System.out.print(a + " ");
		*/

		int arr[] = {12,13,14,44};

		int total = 0;
		for (int a : arr)
		{
			total+= a;	
		}
		System.out.print(total + " ");

	}
}