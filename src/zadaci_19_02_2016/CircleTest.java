package zadaci_19_02_2016;

public class CircleTest {

	public static void main(String[] args) {
		Circle circle1 = new Circle(10);
		Circle circle2 = new Circle(15);
		Circle circle3 = new Circle(10);
		
		System.out.println(circle1.equals(circle2));
		System.out.println((circle1.equals(circle3)));

	}

}
