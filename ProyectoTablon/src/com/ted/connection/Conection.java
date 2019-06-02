package com.ted.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * 
 * @author Cristo
 *
 */
public class Conection {
	public static Connection conect() {
		Connection con = null;

		String user = "root"; //just for developing use
		String pass = "#Ff0016#";
		try {
			
			String server = "jdbc:mysql://localhost/tablon?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
			con = DriverManager.getConnection(server, user, pass);

			if (con != null) {
				System.out.println("Connected");
			}
		} catch (SQLException e) {
			System.out.println("Connection go wrong");
			e.printStackTrace();
		}
		return con;
	}
}
