package com.practice;

import java.sql.Connection;

public class Application {

	public static void main(String[] args) {

		Connection conn = DatabaseConnectionManager.getDbConnection().getConnection();
		
		if(conn != null) {
			System.out.println("Database connection successful!");
		}
		
	}

}
