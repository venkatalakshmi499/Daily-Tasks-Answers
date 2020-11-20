package com.files;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class Task1 {
public static void main(String[] args) throws FileNotFoundException
{
Scanner sc=new Scanner(System.in);
int n;
System.out.println("Enter how many students: ");
n=sc.nextInt(); 
FileOutputStream fos=null;
DataOutputStream dos=null;
for(int i=0;i<n;i++)
{
System.out.println("Enter name of "+i+"th student");
String name=sc.next();
System.out.println("enter dob of"+i+"th student");
String dob=sc.next();
System.out.println("enter marks m1:");
int m1=sc.nextInt();
System.out.println("enter marks m2:");
int m2=sc.nextInt();
System.out.println("enter marks m3:");
int m3=sc.nextInt();
Student s1=new Student(name,dob,m1,m2,m3);
int avg=s1.average();
int tot=s1.total();
String filename=name+".txt";
String s2="";
s2=s2+"\n"+"name: "+s1.name+"\n"+"dob : "+s1.dob+"\n"+"marks 1: "+s1.m1+"\n"+"marks 2: "+s1.m2+"\n"+
                 "marks 3: "+s1.m3+"\n"+"average :"+avg+"\n"+"total: "+tot;
try {
	fos=new FileOutputStream(filename);
	dos=new DataOutputStream(fos);
	byte[]b=s2.getBytes();
	dos.write(b);
}
catch(IOException e) {
	e.printStackTrace();
}

}
}

}