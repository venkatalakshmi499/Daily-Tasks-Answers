package com.src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseConnection {
	private final static String DRIVER_CLASS="com.mysql.cj.jdbc.Driver";
	private final static String URL="jdbc:mysql://localhost:3306/venkydb";
	private final static String USERNAME="root";
	private final static String PASSWORD="Venky@499";
	private Connection con=null;
	private PreparedStatement ps=null;

	public PreparedStatement getStatement(String sqlquery) throws ClassNotFoundException, SQLException
	{
		Class.forName(DRIVER_CLASS);
		con=DriverManager.getConnection(URL, USERNAME, PASSWORD);		
		return con.prepareStatement(sqlquery);			
	}
	
	public int insert(Student s) throws SQLException, ClassNotFoundException
	{
		ps=getStatement("insert into studentDetails values(?,?,?,?,?,?,?,?)");		
		ps.setInt(1, s.getStudentId());	
		ps.setString(2,s.getStudentName());
		//ps.set(3, s.getStudentAddress();
		ps.setInt(4, s.getMathMarks());
		ps.setInt(5, s.getSciMarks());
		ps.setInt(6, s.getSocMarks());
		ps.setInt(7, s.getTotalMarks());
		ps.setDouble(8, s.getAverage());
		ps.setString(9, s.getGrade());	
		
		return ps.executeUpdate();	
		
		
	}
	
//	delete();
//	update()
//	create();
//	display();
	

}