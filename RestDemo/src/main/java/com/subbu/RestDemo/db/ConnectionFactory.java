package com.subbu.RestDemo.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionFactory {

	static Connection con;
	
	public static Connection getConnection() {
	 if(con==null) 
	 {
		 String url="jdbc:mysql://localhost:3306/AlienDB";
			String uname="root";
			String password="";
		 try {
				Class.forName("com.mysql.jdbc.Driver");
				 con= DriverManager.getConnection(url,uname,password);
		 }catch(ClassNotFoundException | SQLException e){
			 System.out.println(e);
		 }
		 return con;
	 }else {
	return con;
	 }
	}
	
	
	static Statement stm;
	public static Statement getStatement() {
		
		try {
			
			Statement stm=ConnectionFactory.getConnection().createStatement();
			return stm; 
		} catch (SQLException e) {
			
			e.printStackTrace();
		}	
		return null;
	}
	
	
}
