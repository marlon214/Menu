package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	String connectionString = "jdbc:mysql://localhost:3306/Food";
	
	try {
		Connection connect = DriverManager.getConnection(connectionString, "root", "Black426!");
		System.out.println("Success!");
	}catch (SQLException e) {
		System.out.println("Error!");
		e.printStackTrace();
	}
}
}
