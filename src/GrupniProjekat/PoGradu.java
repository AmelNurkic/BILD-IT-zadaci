package GrupniProjekat;

import java.sql.*;
import java.util.*;

public class PoGradu {

	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		// Accessing driver from JAR file
		Class.forName("com.mysql.jdbc.Driver");

		// Creating a variable for the connection called con
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/cities", "root", "");

		// Query
		PreparedStatement statement = con.prepareStatement("SELECT * FROM city WHERE Name = ?");
		System.out.println("Insert name of city: ");
		String city = input.nextLine();
		statement.setString(1, city);

		// ResultSet
		ResultSet result = statement.executeQuery();

		while (result.next()) {
			System.out.println("City: " + result.getString(2) + " |District: " + result.getString(4) + " |Population: "
					+ result.getString(5));
		}
		input.close();

	}

}
