/**Draw the UML diagram for the class and then implement the class. Write a
test program that creates the two points (0, 0) and (10, 30.5) and displays the
distance between them.*/
package zadaci_06_02_2016;

public class MyPointTest {

	public static void main(String[] args) {
		MyPoint a = new MyPoint(0, 0);
		MyPoint b = new MyPoint(10, 30.5);
		System.out.println("Distance from a to b is "+a.distance(a,b));
		System.out.println("Distance from a to b is "+a.distance(b));
		

	}

}
