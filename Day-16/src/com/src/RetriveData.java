package com.src;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class RetriveData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/venkydb";
		String user="root";
		String password="Venky@9494776748";

		try(Connection con=DriverManager.getConnection(url, user, password)) {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from customersinfo ");
			 
			while(rs.next())
			{
				System.out.println(rs.getInt("CustomerId")+" | "+rs.getString("CustomerName")+" | "+rs.getString("Customercity")+" | "+rs.getString("CustomerAddress") );
				
			}
			System.out.println("end of the program");
		}
		
		
		
		
		
		
		
		
		catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
