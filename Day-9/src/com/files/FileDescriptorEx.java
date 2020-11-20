package com.files;

import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDescriptorEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
          FileDescriptor fd=null;
          byte[] b = { 99, 80, 68, 78};  
          try {
			FileOutputStream fos=new FileOutputStream("example.txt");
			FileInputStream fis=new FileInputStream("example.txt");
			fd = fos.getFD();  
            fos.write(b);  
            int value = 0;  
            while ((value = fis.read()) != -1) {  
                char c = (char) value;// converts bytes to char  
                System.out.print(c);  
            }  
            System.out.println("\n successfully executed!!");  
            
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          
          
          
	}

}
