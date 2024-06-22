package com.cs403.LoanManagementSystem;

public class Launch {
	private static final String DATABASE = "jdbc:mysql://localhost:3306/loanmanager?createDatabaseIfNotExist=true"; //corresponding server address and database name should be assigned
	private static final String USERNAME = "root";	//username for login to the server should be assigned
	private static final String PASSWORD = "garvish"; //password for login to the server should be assigned

	public static void main(String[] args) throws Exception {
		loadData();
		start(args);
	}

	private static void loadData() throws ClassNotFoundException {
		DataStore.loadData(DATABASE, USERNAME, PASSWORD);
	}
	
	private static void start(String[] args) {
		View.launchApplication(args);
	}
}


