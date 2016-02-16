/**(NumberFormatException) Write the bin2Dec(String binaryString)
method to convert a binary string into a decimal number. Implement the
bin2Dec method to throw a NumberFormatException if the string is not a
binary string.*/
package zadaci_15_02_2016;

import java.util.*;

public class NumberFormatEx {
	public static double bin2Dec(String binary) {
		double number = Long.parseLong(binary, 2);
		return number;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean isOK = true;
		do {
			try {
				System.out.println("Enter the binary number: ");
				String binaryString = input.nextLine();
				System.out.println(bin2Dec(binaryString));
				isOK = false;
			} catch (NumberFormatException ex) {
				System.out.println("You have to enter binary number!");

			}
		} while (isOK);
		{

		}
		input.close();
	}

}
