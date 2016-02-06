/**(Geometry: intersecting point) Suppose two line segments intersect. The two endpoints
for the first line segment are (x1, y1) and (x2, y2) and for the second line
segment are (x3, y3) and (x4, y4). Write a program that prompts the user to enter
these four endpoints and displays the intersecting point. As discussed in Programming
Exercise 3.25, the intersecting point can be found by solving a linear equation.
Use the LinearEquation class in Programming Exercise 9.11 to solve this
equation. See Programming Exercise 3.25 for sample runs.*/
package zadaci_05_02_2016;

import java.util.*;

public class IntersectingPoint {

	public static void main(String[] args) {
		double x1, x2, x3, x4, y1, y2, y3, y4;
		Scanner input = new Scanner(System.in);
		System.out.println("Input X1: ");
		x1 = input.nextDouble();
		System.out.println("Input Y1: ");
		y1 = input.nextDouble();
		System.out.println("Input X2: ");
		x2 = input.nextDouble();
		System.out.println("Input Y2: ");
		y2 = input.nextDouble();
		System.out.println("Input X3: ");
		x3 = input.nextDouble();
		System.out.println("Input Y3: ");
		y3 = input.nextDouble();
		System.out.println("Input X4: ");
		x4 = input.nextDouble();
		System.out.println("Input Y4: ");
		y4 = input.nextDouble();

		double a = y1 - y2;
		double b = x1 - x2;
		double c = y3 - y4;
		double d = x3 - x4;
		double e = a * x1 - b * y1;
		double f = c * x3 - d * y3;

		LinearEquation LE = new LinearEquation(a, b, c, d, e, f);
		if (LE.isSolvable()) {
			System.out.println("The intersecting point is at (" + LE.getX() + ", " + LE.getY() + ")");
		} else {
			System.out.println("The two lines are parallel");
		}

		input.close();
	}

}
