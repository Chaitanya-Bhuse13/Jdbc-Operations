package com.tka.config;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcConfig{
	static Connection connection = null;
	
	public static Connection getCon() {

		
		try {
			//load Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//get Connection
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/201_jdbc","root","root");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}
}

	


