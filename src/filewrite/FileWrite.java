package filewrite;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite 
{	
	public static void main(String[] args) throws IOException
	{
		FileWriter fw = new FileWriter("D://test.txt");
		
		BufferedWriter buffw = new BufferedWriter(fw);
		
		buffw.write("java!!!");
		
		buffw.flush();
		
		fw.close();	
		
		
	}	
}
