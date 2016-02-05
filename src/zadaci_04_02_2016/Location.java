/**(The Location class) Design a class named Location for locating a maximal
value and its location in a two-dimensional array. The class contains public data
fields row, column, and maxValue that store the maximal value and its indices
in a two-dimensional array with row and column as int types and maxValue as
a double type.
Write the following method that returns the location of the largest element in a
two-dimensional array:
public static Location locateLargest(double[][] a)*/
package zadaci_04_02_2016;

public class Location {
	// osobine
	public int row;
	public int column;
	public double maxValue;

	// konstruktori
	public Location() {

	}

	public Location(int row, int column) {
		this.row = row;
		this.column = column;
	}

	// metode
	public static Location locateLargest(double[][] a) {
		Location location = new Location(); // make your instance
		location.row = 0;
		location.column = 0;
		location.maxValue = a[0][0];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > location.maxValue) {
					location.row = i;
					location.column = j;
					location.maxValue = a[i][j];
				}
			}
		}
		return location; // return the instance
	}
}
