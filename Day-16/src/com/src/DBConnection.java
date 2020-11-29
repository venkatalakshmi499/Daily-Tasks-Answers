
package com.src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
	
	
	public PreparedStatement getStatement(String sql)
	{
		PreparedStatement ps=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");//loaded driver class
		
		String url = "jdbc:mysql://localhost:3306/shivadb";
		String user = "root";
		String password = "root";
		Connection con=DriverManager.getConnection(url, user, password);// getting connection
		
		ps=con.prepareStatement(sql);
		
		return ps;
		
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 
		
		return ps;
	}
}