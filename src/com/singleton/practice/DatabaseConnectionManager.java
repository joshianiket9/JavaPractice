package com.singleton.practice;

public class DatabaseConnectionManager {

	private static volatile DatabaseConnectionManager dbConnectionManager;
		
	private DatabaseConnectionManager(){
		if(dbConnectionManager != null) {
			throw new RuntimeException("dbConnectionManager already exists");
		}
	}
	
	public static DatabaseConnectionManager getDatabaseConnectionManager() {
		
		if(dbConnectionManager == null) {
			
			synchronized(DatabaseConnectionManager.class) {
				
				if(dbConnectionManager == null) {
					dbConnectionManager = new DatabaseConnectionManager();
				}
				
			}
			
		}
		return dbConnectionManager;
	}
	
}
