/**(The ComparableCircle class) Define a class named ComparableCircle
that extends Circle and implements Comparable. Draw the UML diagram and
implement the compareTo method to compare the circles on the basis of area.
Write a test class to find the larger of two instances of ComparableCircle objects.*/
package zadaci_18_02_2016;

public class Circle extends GeometricObject implements Comparable<GeometricObject> {
	// arguments
	double radius;

	// Empty constructor
	public Circle() {

	}

	// Constructor with defined arguments
	public Circle(String color, boolean filled, double radius) {
		super(color, filled);
		this.radius = radius;
	}

	// Get radius
	public double getRadius() {
		return radius;
	}
	// Set radius

	public void setRadius(double radius) {
		this.radius = radius;
	}

	// compare to
	public int compareTo(Circle o) {
		if (this.getArea() > o.getArea()) {
			return 1;
		} else if (this.getArea() < o.getArea()) {
			return -1;
		} else
			return 0;
	}

	@Override
	public double getArea() {
		return radius * radius * Math.PI;
	}

}
