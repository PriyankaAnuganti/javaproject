package com.revatures;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class database {
	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			String connectionString = "jdbc:postgresql://tyke.db.elephantsql.com:5432/zmjycfuf",
			     username = "zmjycfuf",
			     password = "3TZRGMRBTwdKv-ilY_BpqPZWECKu8UL9";
			
			Connection connection = DriverManager.getConnection(connectionString, username, password);
			
			Statement statement = connection.createStatement();
			
			ResultSet result = statement.executeQuery("SELECT * FROM tenants");
			while(result.next()) {
				System.out.println("Id: " +result.getInt("tenant_id")+ ", rent: " +result.getDouble("rent"));
				
			}
				
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
