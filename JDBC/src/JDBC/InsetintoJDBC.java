
package JDBC;

import java.sql.*;

public class InsetintoJDBC {

	public static void main(String[] args) throws SQLException {
		String URL = "jdbc:mysql://localhost:3306/mydb";
		String uname = "root";
		String PASSWORD = "";
		String query = "select distinct * from students ";

//			   try {
//				   Class.forName("com.mysql.jdbc.Drivers");
//				
//			} catch (ClassNotFoundException e) {
//				e.printStackTrace();
//				
//			}
		try {
			Connection con = DriverManager.getConnection(URL, uname, PASSWORD);
			Statement stm = con.createStatement();

			System.out.println("Inserting records into the table...");
			String sql = "INSERT INTO students VALUES (100, 'Zara', 'Ali', 2021, 19)";
			stm.executeUpdate(sql);
			sql = "INSERT INTO students VALUES (101, 'Mahnaz', 'Fatma', 2021, 25)";
			stm.executeUpdate(sql);
			sql = "INSERT INTO students VALUES (102, 'Zaid', 'Khan', 2021, 30)";
			stm.executeUpdate(sql);
			sql = "INSERT INTO students VALUES(103, 'Sumit', 'Mittal',2021, 28)";
			stm.executeUpdate(sql);
			System.out.println("Inserted records into the table...");

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
