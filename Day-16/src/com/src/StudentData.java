package com.src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StudentData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter student details");
	    System.out.println("enter student id: ");
     	int sid=sc.nextInt();
		System.out.println("enter student name:");
		String sname=sc.next();
		System.out.println("enter student address");
		String sadd=sc.next();
		System.out.println("enter student pwd: ");
		String pwd=sc.next();
		*/
		 String sql="update student set sname='ramu' where sid=5";
		 String del="delete from student where sid=6";
		
   String url="jdbc:mysql://localhost:3306/venkydb";
   String user="root";
   String password="Venky@9494776748";
   
   try(Connection con=DriverManager.getConnection(url, user, password))
   {
	   Class.forName("com.mysql.cj.jdbc.Driver");
	   Statement st=con.createStatement();
	   ResultSet rs=st.executeQuery("select * from student");
	   
	   while(rs.next())
	   {
		   System.out.println(rs.getInt(1)+" | "+rs.getString(2)+" | "+rs.getString(3)+" | "+rs.getString(4));
	   }
	   System.out.println("data coming");
	   
/*	  int i= st.executeUpdate("insert into student values("+sid+ ",'"+sname+"','"+sadd+"','"+pwd+"')");
	   if(i>0)
	   {
		   System.out.println("values got inserted");
	   }
	   else
	   {
		   System.out.println("values failed to insert");
	   }
	  */
	   st.executeUpdate(sql);
	   st.executeUpdate(del);
	   
   } catch (SQLException | ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

}
