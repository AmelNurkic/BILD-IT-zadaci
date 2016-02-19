/**Design a class named Square that extends
GeometricObject and implements Colorable. Implement howToColor to
display the message Color all four sides.*/
package zadaci_18_02_2016;

public class Square extends GeometricObject implements Colorable {

	// attributes
	public double a;

	// Empty constructor
	public Square() {

	}

	// Constructor with attributes
	public Square(String color, boolean filled, double a) {
		super(color, filled);
		this.a = a;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return a*a;
	}

	@Override
	public void howToColor() {
		System.out.println("Color all four sides.");

	}

}
