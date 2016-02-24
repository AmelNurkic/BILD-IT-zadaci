/**(Print the characters in a string reversely) Write a recursive method that displays
a string reversely on the console using the following header:
public static void reverseDisplay(String value)
For example, reverseDisplay("abcd") displays dcba. Write a test program
that prompts the user to enter a string and displays its reversal.*/
package zadaci_23_02_2016;

import java.util.*;

public class ReversingString {

	public static void reverseDisplay(String value) {
		// if there is no more letters get out of method
		if (value.length() == 0)
			return;
		// print last letter of value string
		System.out.print(value.substring(value.length() - 1));
		// delete last letter of value string
		reverseDisplay(value.substring(0, value.length() - 1));

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter string which needs to reverse: ");
		String a = input.next();
		System.out.println("Reversed string: ");
		reverseDisplay(a);
		input.close();
	}

}
