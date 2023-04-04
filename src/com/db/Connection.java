package com.db;

import java.sql.DriverManager;

public class Connection {
	private static final String host = "localhost";
	private static final String port = "3306";
	private static final String database = "javatest1";

	private static String user = "root";
	private static String password = "root";
	private static String url = "";
	private static java.sql.Connection con = null;

	public static void main(String[] args) {
		if (openConnection() != null) {
			System.out.println("connected to " + database.toString());
		}
	}

	public static java.sql.Connection openConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			url = "jdbc:mysql://" + host + ":" + port + "/" + database;
			con = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

	public static void closeConnection(java.sql.Connection con) {
		try {
			closeConnection(con);
			;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}