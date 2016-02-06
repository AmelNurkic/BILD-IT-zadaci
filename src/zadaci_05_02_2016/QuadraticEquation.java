/**(Algebra: quadratic equations) Design a class named QuadraticEquation for
a quadratic equation ax2 + bx + x = 0. The class contains:
■ Private data fields a, b, and c that represent three coefficients.
■ A constructor for the arguments for a, b, and c.
■ Three getter methods for a, b, and c.
■ A method named getDiscriminant() that returns the discriminant, which is
b2 - 4ac.
■ The methods named getRoot1() and getRoot2() for returning two roots of
the equation
r1 =
-b + 2b2 - 4ac
2a
and r2 =
-b - 2b2 - 4ac
2a
These methods are useful only if the discriminant is nonnegative. Let these methods
return 0 if the discriminant is negative.
Draw the UML diagram for the class and then implement the class. Write a test
program that prompts the user to enter values for a, b, and c and displays the result
based on the discriminant. If the discriminant is positive, display the two roots. If
the discriminant is 0, display the one root. Otherwise, display “The equation has
no roots.” See Programming Exercise 3.1 for sample runs.*/
package zadaci_05_02_2016;

public class QuadraticEquation {

	// osobine
	private double a;
	private double b;
	private double c;

	// konstruktori
	public QuadraticEquation(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	// metode
	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}

	public double getDiscriminant() {
		return (b * b) - (4 * a * c);
	}

	public double getRoot1() {
		double help = Math.sqrt(getDiscriminant());
		if (getDiscriminant() >= 0)
			return (-b + help) / (2 * a);
		else {
			return 0;
		}
	}

	public double getRoot2() {
		double help = Math.sqrt(getDiscriminant());
		if (getDiscriminant() >= 0)
			return (-b - help) / (2 * a);
		else {
			return 0;
		}

	}
}
