package com.files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class PrintStream {

	public PrintStream(FileOutputStream fos) {
		// TODO Auto-generated constructor stub
	       System.out.println("hi");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    FileOutputStream fos=null;
    try {
		fos=new FileOutputStream("vv.txt");
		PrintStream ps=new PrintStream(fos);
	    ps.println(true);
	    System.out.println("data is inserted");
	    
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
	}

	private void println(boolean b) {
		// TODO Auto-generated method stub
		
	}

}
