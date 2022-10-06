import java.io.*;
class trial
{
	public static void main(String[] args) {
		

		try
		{
			FileWriter f=new FileWriter("c:\\Users\\saura\\OneDrive\\Desktop\\JAVA\\FH.txt");
			try 
			{
				f.write("Java programming is the best language");
			}
			finally
			{
				f.close();
			}
			System.out.println("Succesfully wrote");
		}
		catch(IOException n)
		{
			System.out.println(n);
		}
	}
}