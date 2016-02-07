/**(The MyPoint class) Design a class named MyPoint to represent a point with
x- and y-coordinates. The class contains:
■ The data fields x and y that represent the coordinates with getter
methods.
■ A no-arg constructor that creates a point (0, 0).
■ A constructor that constructs a point with specified coordinates.
■ A method named distance that returns the distance from this point to a
specified point of the MyPoint type.
■ A method named distance that returns the distance from this point to
another point with specified x- and y-coordinates.
Draw the UML diagram for the class and then implement the class. Write a
test program that creates the two points (0, 0) and (10, 30.5) and displays the
distance between them.*/
package zadaci_06_02_2016;

public class MyPoint {

	// osobine
	double x, y;

	// konstruktori
	public MyPoint() {
	}

	public MyPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}

	// metode
	public double getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double distance(MyPoint a, MyPoint b) {
		double x1 = a.getX();
		double y1 = a.getY();

		double x2 = b.getX();
		double y2 = b.getY();

		double x = x2 - x1;
		double y = y2 - y1;

		double distance = Math.sqrt((x * x) + (y * y));

		return distance;
	}

	public double distance(MyPoint a) {
		double x1 = a.getX();
		double y1 = a.getY();

		double x2 = 0;
		double y2 = 0;

		double x = x2 - x1;
		double y = y2 - y1;

		double distance = Math.sqrt((x * x) + (y * y));

		return distance;
	}

}
