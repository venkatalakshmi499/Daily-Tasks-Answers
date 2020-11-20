package com.files;
import java.io.FileWriter;
import java.io.IOException;
public class FileWriterEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter f1=null;
		try {
			f1=new FileWriter("gg.txt");
			f1.write("Hello World");
			System.out.println("Written to the file");
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally {
			try {
				f1.close();
			}
			catch(IOException i)
			{
				i.printStackTrace();
			}
		}

	}

}
