package zadaci_19_02_2016;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle rec1 = new Rectangle(4, 4);
		Rectangle rec2 = new Rectangle(9, 9);
		Rectangle rec3 = new Rectangle(4, 4);
		System.out.println(rec1.equals(rec2));
		System.out.println(rec1.equals(rec3));

	}

}
