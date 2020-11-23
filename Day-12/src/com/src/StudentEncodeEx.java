package com.src;
import java.util.Base64;
import java.util.Scanner;
public class StudentEncodeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter the student name");
			String name=sc.next();
			System.out.println("Enter the student address");
			String addr=sc.next();
			System.out.println("Enter the student mailid");
			String mailid=sc.next();
		Base64.Encoder encode=Base64.getEncoder();
		String sname=encode.encodeToString(name.getBytes());
		System.out.println(sname);
		Base64.Encoder encode1=Base64.getEncoder();
		String saddr=encode1.encodeToString(addr.getBytes());
		System.out.println(saddr);
		Base64.Encoder encode2=Base64.getEncoder();
		String smailid=encode2.encodeToString(mailid.getBytes());
		System.out.println(smailid);
	}

}
