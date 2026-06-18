package jdbc_connection;

//step - 1  -> Import The Package

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//import java.sql.*;

public class MyConnection {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/jdbc_02pm";
		String username = "root";
		String password = "12345";

		String query = "Select * from student";

//		Step - 2    -> Load The Driver

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

//			Step - 3  -> Create The Connection 

			Connection con = DriverManager.getConnection(url, username, password);

//			Step - 4  -> Create Statement 

			Statement st = con.createStatement();

//			Step - 5  -> Execute Query

			ResultSet rs = st.executeQuery(query);

//			Step - 6  -> Process Result 

//			System.out.println(rs);

			while (rs.next()) {
				int roll = rs.getInt("roll_no");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String gender = rs.getString("gender");
				String city = rs.getString("city");

				System.out.println(roll + " " + name + " " + email + " " + gender + " " + city);

			}

			rs.close();
			st.close();
			con.close();

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}







//			rs.next();
//
//			int roll = rs.getInt(1);
//			int roll = rs.getInt("roll_no");
//			System.out.println(roll);

//			String name = rs.getString(2);
//			String name = rs.getString("name");
//			System.out.println(name);

//			String email = rs.getString(3);
//			String email = rs.getString("email");
//			System.out.println(email);

//			String gender = rs.getString(4);
//			String gender = rs.getString("gender");
//			System.out.println(gender);

//			String city = rs.getString(5);
//			String city = rs.getString("city");
//			System.out.println(city);

//			}

////			****************************
//			
//			rs.next();
//			
////			int roll = rs.getInt(1);
//			int roll1 = rs.getInt("roll_no");
//			System.out.println(roll1);
//			
////			String name = rs.getString(2);
//			String name1 = rs.getString("name");
//			System.out.println(name1);
//			
////			String email = rs.getString(3);
//			String email1 = rs.getString("email");
//			System.out.println(email1);
//			
////			String gender = rs.getString(4);
//			String gender1 = rs.getString("gender");
//			System.out.println(gender1);
//			
//			String city = rs.getString(5);
//			String city1 = rs.getString("city");
//			System.out.println(city1);

//			Step - 7  -> Close Resources
