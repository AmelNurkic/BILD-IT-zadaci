/**Draw the UML diagram for the class and then implement the class. Write a test
program that creates three RegularPolygon objects, created using the no-arg
constructor, using RegularPolygon(6, 4), and using RegularPolygon(10,
4, 5.6, 7.8). For each object, display its perimeter and area.*/
package zadaci_05_02_2016;

public class RegularPolygonTest {

	public static void main(String[] args) {
		RegularPolygon mnogougao1 = new RegularPolygon();
		System.out.println("Polygon1 - Perimeter: " + mnogougao1.getPerimeter() + " Area: " + mnogougao1.getArea());
		RegularPolygon mnogougao2 = new RegularPolygon(6, 4);
		System.out.println("Polygon2 - Perimeter: " + mnogougao2.getPerimeter() + " Area: " + mnogougao2.getArea());
		RegularPolygon mnogougao3 = new RegularPolygon(10, 4, 5.6, 7.8);
		System.out.println("Polygon3 - Perimeter: " + mnogougao3.getPerimeter() + " Area: " + mnogougao3.getArea());

	}

}
