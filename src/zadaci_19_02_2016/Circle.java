/**(Enable Circle comparable) Rewrite the Circle class in Listing 13.2 to extend
GeometricObject and implement the Comparable interface. Override the
equals method in the Object class. Two Circle objects are equal if their radii
are the same. Draw the UML diagram that involves Circle, GeometricObject,
and Comparable.*/
package zadaci_19_02_2016;

public class Circle extends GeometricObject implements Comparable<GeometricObject> {

	// arguments
	double radius;

	// Constructor with radius
	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	public boolean equals(Object o){
		if(this.radius==((Circle)o).radius){
			return true;
		}
		return false;
	}

	@Override
	public double getArea() {
		return radius * radius * Math.PI;
	}

}
