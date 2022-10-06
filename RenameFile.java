import java.io.*;
class trial
{
	public static void main(String[] args) 
	{
		
		File f=new File("c:\\Users\\saura\\OneDrive\\Desktop\\JAVA\\FH.txt");
		File r=new File("c:\\Users\\saura\\OneDrive\\Desktop\\JAVA\\KK.txt");

		if (f.exists())
			System.out.println(f.renameTo(r));
		else 
			System.out.println("File doesn't exists");
	}		
}		