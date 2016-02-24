/**(Print the digits in an integer reversely) Write a recursive method that displays
an int value reversely on the console using the following header:
public static void reverseDisplay(int value)
For example, reverseDisplay(12345) displays 54321. Write a test program
that prompts the user to enter an integer and displays its reversal.*/
package zadaci_23_02_2016;

import java.util.*;

public class Reversing {

	public static void reverseDisplay(int value) {
		// if value = 0 get out from method
		if (value == 0)
			return;
		// getting last digit of value and print it
		int a = value % 10;
		System.out.print(a);
		// delete one decimal space or last digit whatever :D
		reverseDisplay(value / 10);
	}

	public static void main(String[] args) {
		System.out.println("Enter number to reverse: ");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		System.out.println("Reversed number of " + a + " is ");
		reverseDisplay(a);
		input.close();

	}

}
