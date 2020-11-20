package com.files;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.FileOutputStream;
public class ByteArrayOutputStreamEx{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ByteArrayOutputStream bos=null;
		FileOutputStream fos=null;
		try {
			bos=new ByteArrayOutputStream();
			 String str="This is byte array output stream";
			 byte[] b=str.getBytes();
			bos.write(b);
			fos=new FileOutputStream('t.txt');
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
		
		

	}

}
