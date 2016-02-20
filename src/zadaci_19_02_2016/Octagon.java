/**(The Octagon class) Write a class named Octagon that extends
GeometricObject and implements the Comparable and Cloneable interfaces.
Assume that all eight sides of the octagon are of equal length. The area can
be computed using the following formula:
area = (2 + 4/22)* side * side
Draw the UML diagram that involves Octagon, GeometricObject,
Comparable, and Cloneable. Write a test program that creates an Octagon
object with side value 5 and displays its area and perimeter. Create a new object
using the clone method and compare the two objects using the compareTo
method.*/
package zadaci_19_02_2016;

public class Octagon extends GeometricObject implements Cloneable, Comparable<GeometricObject> {
	// attributes
	double a;

	// counstructor
	public Octagon(double a) {
		this.a = a;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (2 + (4 * Math.sqrt(2))) * a * a;
	}

	public double getPerimeter() {
		return 8 * a;
	}

	public boolean equals(Object o) {
		if (this.getArea() == ((Octagon) o).getArea()) {
			return true;
		}
		return false;
	}

	public double getA() {
		return a;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public void setA(double a) {
		this.a = a;
	}

}
