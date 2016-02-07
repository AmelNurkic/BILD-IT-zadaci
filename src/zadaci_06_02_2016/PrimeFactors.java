/**(Displaying the prime factors) Write a program that prompts the user to enter
a positive integer and displays all its smallest factors in decreasing order. For
example, if the integer is 120, the smallest factors are displayed as 5, 3, 2, 2,
2. Use the StackOfIntegers class to store the factors (e.g., 2, 2, 2, 3, 5) and
retrieve and display them in reverse order.*/
package zadaci_06_02_2016;

import java.util.*;

public class PrimeFactors {
	public static void main(String[] args) {

		// Scanner input = new Scanner(System.in);
		try (java.util.Scanner input = new java.util.Scanner(System.in)) {
			System.out.print("Enter a positive integer: ");
			int a = input.nextInt();
			if (a < 0)
				throw new java.util.InputMismatchException();
			Stack<Integer> stack = new Stack<Integer>();

			int b = 2;
			while (b <= a) {
				if (a % b == 0) {
					stack.push(b);
					a = a / b;
				} else {
					b++;
				}
			}
			while (!stack.empty()) {
				System.out.println(stack.pop());
			}
		} catch (java.util.InputMismatchException e) {
			System.err.println("Wrong input");

		}
	}
}
