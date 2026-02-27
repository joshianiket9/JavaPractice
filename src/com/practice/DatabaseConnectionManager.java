package com.practice;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnectionManager {

	private static volatile DatabaseConnectionManager dataBaseConnectionManager;

	private static final String DB_URL = "jdbc:mysql://localhost:3306/cardworks?useSSL=false";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
	
    private Connection connection;
    
	private DatabaseConnectionManager() {

		try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
        } catch (Exception e) {
            throw new RuntimeException("Error connecting to database", e);
        }
		
	}

	public static DatabaseConnectionManager getDbConnection() {

		if (dataBaseConnectionManager == null) {

			synchronized (DatabaseConnectionManager.class) {
				if (dataBaseConnectionManager == null) {
					dataBaseConnectionManager = new DatabaseConnectionManager();
				}
			}

		}
		return dataBaseConnectionManager;
	}
	
	public Connection getConnection() {
		return connection;
	}
}