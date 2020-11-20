package com.files;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
public class FileReaderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr=null;
		
		try {
			fr=new FileReader("This is venky");
			fr.toString();
			char c[]= {'h','i','a','l','l' };
			fr.read();
			System.out.println("Read to file");
			
			}
		catch(IOException i)
		{
			i.printStackTrace();
		}
		finally {
			try {
				fr.close();
			}
			catch(IOException i)
			{
				i.printStackTrace();
			}
		}

	}

}
