import java.io.*;
class fileInfo
{
	public static void main(String[] args) {
		
		File f=new File("c:\\Users\\saura\\OneDrive\\Desktop\\JAVA\\FH.txt");

		if(f.exists())
		{
			System.out.println("File name: "+f.getName());
			System.out.println("File Location: "+f.getAbsolutePath());
			System.out.println("File Writable: "+f.canWrite());
			System.out.println("File Readable: "+f.canRead());
			System.out.println("File Size: "+f.length());
			// System.out.println("File Removed: "+f.delete());
		}
		else 
		{
			System.out.println("File not exists");
		}

	}
}