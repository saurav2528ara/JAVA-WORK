/*  Copy content one file to another file  */
// import java.io.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
class trial
{
	public static void main(String[] args) throws IOException{
		
	FileInputStream f= new FileInputStream("c:\\Users\\saura\\OneDrive\\Desktop\\JAVA\\FH.txt");
	FileOutputStream r= new FileOutputStream("c:\\Users\\saura\\OneDrive\\Desktop\\JAVA\\kk.txt");


				int i;
				while((i=f.read())!=-1)
				{
					System.out.print((char)i); //Type cast
				}
				System.out.println("Data copied successfuly");
	}

}