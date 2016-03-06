package GrupniProjekat;

import java.sql.*;
import java.util.*;

public class PoBrojuStanovnika {

	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		// Accessing driver from JAR file
		Class.forName("com.mysql.jdbc.Driver");

		// Creating a variable for the connection called con
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/cities", "root", "");

		// Prepared statement
		PreparedStatement statement = con.prepareStatement("SELECT * FROM country WHERE Population < ?");
		System.out.println("Enter population (less then):");
		int manjeOd = input.nextInt();
		statement.setInt(1, manjeOd);
		// ResultSet
		ResultSet result = statement.executeQuery();

		while (result.next()) {
			System.out.println("Country: " + result.getString(2) + " Continent: " + result.getString(3) + " Area: "
					+ result.getString(5) + " Population: " + result.getString(7));
		}
		input.close();

	}

}
