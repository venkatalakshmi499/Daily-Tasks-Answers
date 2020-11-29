package com.src;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class StudentDatabase 
{​​​​​​​
    public static void main(String[] args) throws ClassNotFoundException, SQLException 
    {​​​​​​​
	    String url="jdbc:mysql://localhost:3306/venkydb";
        String user="root";
        String password="Venky@499";
        Connection con=null;
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
           ​​​​​​​
           do 
            {​​​​​​​
                System.out.println("1. Add Student");
                System.out.println("2. Remove Student");
                System.out.println("3. Update Student");
                System.out.println("4. Display Student");
                System.out.println("5. Logout");
                System.out.println("Enter your choice : ");
                ch=sc.nextInt();
            switch(ch)
            {​​​​​​​
            case 1:
            {​​​​​​​
                System.out.println("Enter Id : ");
                int StudentId=sc.nextInt();
                System.out.println("Enter Name : ");
                String StudentName=sc.next();
                System.out.println("Enter Grade : ");
                String StudentGrade=sc.next();
                System.out.println("Enter Total : ");
                int StudentTotal=sc.nextInt();
                int i=st.executeUpdate("insert into StudentDetails values("+StudentId+",'"+StudentName+"','"+StudentGrade+"',"+StudentTotal+")");
                System.out.println("Added Successfully");
                break;
            }​​​​​​​
            case 2:
            {​​​​​​​
                System.out.println("Enter Id to remove : ");
                int id=sc.nextInt();
                int j= st.executeUpdate("delete from StudentDetails where StudentId="+id+"");
                System.out.println("Removed Successfully");
                break;
            }​​​​​​​
            case 3:
            {​​​​​​​
                System.out.println("Enter Id to update : ");
                int id=sc.nextInt();
                System.out.println("Enter Name : ");
                String SName=sc.next();
                System.out.println("Enter Grade : ");
                String SGrade=sc.next();
                System.out.println("Enter Total : ");
                int STotal=sc.nextInt();
                int k=st.executeUpdate("update StudentDetails set StudentName='"+SName+"',StudentGrade='"+SGrade+"',StudentTotal="+STotal+" where StudentId="+id+"");
                System.out.println(k);
                break;
            }​​​​​​​
            case 4:
            {​​​​​​​
                ResultSet rs1=st.executeQuery("select * from StudentDetails");
                ResultSetMetaData rsmd = rs1.getMetaData();
                System.out.println(rsmd.getCatalogName(1)+"  |  "+rsmd.getCatalogName(2)+"  |  "+rsmd.getCatalogName(3)+"  |  "+rsmd.getCatalogName(4));
                while(rs1.next())
                {​​​​​​​
                    System.out.println(rs1.getInt("StudentId")+"  |  "+rs1.getString("StudentName")+"  |  "+rs1.getString("StudentGrade")+"  |  "+rs1.getInt("StudentTotal"));
                }​​​​​​​
                break;
            }​​​​​​​
            case 5:
            {​​​​​​​
                System.out.println("Logout");
                break;
            }​​​​​​​
        }​​​​​​​
    }​​​​​​​while(ch!=5);
    }​​​​​​​
    }​​​​​​​
}​​​​​​​
 




