import java.util.Arrays;
class trial
{
	public static void main(String[] args)
	{
		int arr[] = {2,5,7,8,9};
		int brr[] = {2,5,7,8,9};

		if (Arrays.equals(arr,brr))
			System.out.print("Both are equals");
		else 
			System.out.print("Both are not equals");
	}
}