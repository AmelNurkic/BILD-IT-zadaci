package GrupniProjekat;

import java.sql.*;
import java.util.*;

public class GradoviPoImenuDrzave {

	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		// Accessing driver from JAR file
		Class.forName("com.mysql.jdbc.Driver");

		// Creating a variable for the connection called con
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/cities", "root", "");

		// Query
		PreparedStatement statement = con.prepareStatement("SELECT * FROM country WHERE Name=?");
		System.out.println("Insert name of country: ");
		String country = input.nextLine();
		statement.setString(1, country);

		// Creating a variable to execute query
		ResultSet result = statement.executeQuery();
		String countryCode = "";
		// Getting country code because we need it in another table
		while (result.next()) {
			countryCode = result.getString(1);
		}
		input.close();

		// Query 2
		PreparedStatement statement2 = con.prepareStatement("SELECT * FROM city WHERE CountryCode=?");
		statement2.setString(1, countryCode);
		// Result2
		ResultSet result2 = statement2.executeQuery();

		while (result2.next()) {
			System.out.println("City: " + result2.getString(2) + ", District: " + result2.getString(4));
		}

	}

}
