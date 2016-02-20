/**Draw the UML diagram that involves Octagon, GeometricObject,
Comparable, and Cloneable. Write a test program that creates an Octagon
object with side value 5 and displays its area and perimeter. Create a new object
using the clone method and compare the two objects using the compareTo
method.*/
package zadaci_19_02_2016;

public class OctagonTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Octagon o1 = new Octagon(5);
		System.out.println("Area of o1 is: "+o1.getArea());
		System.out.println("Perimeter of o1 is: "+o1.getPerimeter());
		Octagon o2 = (Octagon)o1.clone();
		System.out.println(o1.equals(o2));

	}

}
