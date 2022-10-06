import java.io.*;
class trial
{
	public static void main(String[] args) {
		

		try
		{
			FileReader f=new FileReader("c:\\Users\\saura\\OneDrive\\Desktop\\JAVA\\FH.txt");
			try 
			{
				int i;
				while((i=f.read())!=-1)
				{
					System.out.print((char)i); //Type cast
				}
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