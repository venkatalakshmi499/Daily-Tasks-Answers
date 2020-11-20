package com.files;

import java.io.File;
import java.util.Scanner;

public class FileListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner name = new Scanner(System.in);
		System.out.println("enter folder name to know what kind of files are there, enter full path");
		String str=name.next();
		File f=new File(str);
		
		//String filename[]=f.list();
		
		File files[]=f.listFiles();
		
		for(File fi:files)
		{
			System.out.println(fi.getName()+"  - "+fi.canWrite()+"  -  "+fi.isHidden()+" - "+fi.length());
		}

	}

}
