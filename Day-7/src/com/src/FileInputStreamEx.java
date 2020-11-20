package com.src;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fis = null;
		try {
			fis = new FileInputStream("C:\\Users\\laxmi\\eclipse-workspace\\Day-7\\src\\Account.java");
			int i;
			while ((i = fis.read()) != -1) {
				System.out.print((char) i);
			}
		} catch (FileNotFoundException f) {
			f.printStackTrace();
		}

	}

}
