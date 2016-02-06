/**Write a test
program that prompts the user to enter values for a, b, and c and displays the result
based on the discriminant. If the discriminant is positive, display the two roots. If
the discriminant is 0, display the one root. Otherwise, display “The equation has
no roots.” See Programming Exercise 3.1 for sample runs.*/
package zadaci_05_02_2016;

import java.util.*;

public class QuadraticEquationTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input a: ");
		int a = input.nextInt();
		System.out.println("Input b: ");
		int b = input.nextInt();
		System.out.println("Input c: ");
		int c = input.nextInt();

		QuadraticEquation QE = new QuadraticEquation(a, b, c);
		if (QE.getDiscriminant() > 0) {
			System.out.println("The equation has two roots: " + QE.getRoot1() + " and " + QE.getRoot2());
		} else if (QE.getDiscriminant() == 0) {
			System.out.println("The equation has one root: " + QE.getRoot1());
		} else
			System.out.println("The equation has no roots.");
		input.close();
	}

}
