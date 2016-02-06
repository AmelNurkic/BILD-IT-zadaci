/**Draw the UML diagram for the class and then implement the class. Write a test
program that prompts the user to enter a, b, c, d, e, and f and displays the result.
If ad - bc is 0, report that “The equation has no solution.” See Programming
Exercise 3.3 for sample runs.*/
package zadaci_05_02_2016;

import java.util.*;

public class LinearEquationTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		LinearEquation LE = new LinearEquation(a, b, c, d, e, f);
		if (LE.isSolvable()) {
			System.out.println("X je :" + LE.getX() + " a Y je: " + LE.getY());
		} else {
			System.out.println("Equation has no solution");
		}
		input.close();

	}

}
