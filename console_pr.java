import java.io.*;
class trial
{
	public static void main(String[] args)
	{
		String str; char ch[];
		Console in = System.console();
		System.out.print("Enter username: ");
		str = in.readLine();
		System.out.print("Enter Password: ");
		ch = in.readPassword();
		String a = String.valueOf(ch);

		System.out.println("username: "+ str);
		System.out.println("password: "+ a);
	}
}