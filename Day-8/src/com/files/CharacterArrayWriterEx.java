package com.files;
import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;
public class CharacterArrayWriterEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text="Hello all";
		FileWriter fw=null;
		CharArrayWriter cw=null;
	  try {
		  fw=new FileWriter("venky.txt");
			cw=new CharArrayWriter();
			char c[]= {'h','i','a','l','l' };
			cw.write(c);
			cw.writeTo(fw);
			System.out.println("Writter to char array");
	  }
	  catch(IOException e)
	  {
		  e.printStackTrace();
	  }
	  finally {
			try {
				fw.close();
			}
			catch(IOException i)
			{
				i.printStackTrace();
			}
		}

	}

}
