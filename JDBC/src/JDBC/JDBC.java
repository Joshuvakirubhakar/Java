package JDBC;

import java.sql.*;

public class JDBC {

	public static void main(String[] args) throws SQLException {
		String URL = "jdbc:mysql://localhost:3306/mydb";
		String uname = "root";
		String PASSWORD = "";
		String query = "select distinct * from students ";

//	   try {
//		   Class.forName("com.mysql.jdbc.Drivers");
//		
//	} catch (ClassNotFoundException e) {
//		e.printStackTrace();
//		
//	}
		try {
			Connection con = DriverManager.getConnection(URL, uname, PASSWORD);
			Statement stm = con.createStatement();
			ResultSet rst = stm.executeQuery(query);

			while (rst.next()) {

				String nme = "";
				for (int i = 1; i <= 5; i++) {

					nme += rst.getString(i) + ":";
				}
				System.out.println(nme);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
