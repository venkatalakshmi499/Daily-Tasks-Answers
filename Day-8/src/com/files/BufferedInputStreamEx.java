package com.files;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class BufferedInputStreamEx {
	public static void main(String args[])
	{
		FileOutputStream fos=null;
		try {
			fos=new FileOutputStream("h.txt");
			BufferedOutputStream bos=BufferedOutputStream(fos);
			String str="venky is gud girl";
			byte b[]=str.getBytes();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
