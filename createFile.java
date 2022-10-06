// Create a File
import java.io.*;
class createFile
{
	public static void main(String[] args) throws IOException{
		
		File f=new File("c:\\Users\\saura\\OneDrive\\Desktop\\JAVA\\FH.txt");
		/*try  (2nd approach)
		{
			if(f.createNewFile())
		{
			System.out.println("File successfully created");
		}
			else 
		{
			System.out.println("File already exist");
		}
		}
		catch(IOException n)
		{
			System.out.println(n);
		}*/
		if (f.createNewFile())
			System.out.println("File successfully created");
		else 
			System.out.println("File already exist");
		
	}
}