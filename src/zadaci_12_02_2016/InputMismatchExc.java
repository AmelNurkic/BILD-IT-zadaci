/**(InputMismatchException) Write a program that prompts the user to read
two integers and displays their sum. Your program should prompt the user to
read the number again if the input is incorrect.*/
package zadaci_12_02_2016;

import java.util.*;

public class InputMismatchExc {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean isOK = true;
		do {
			try {
				System.out.println("Unesite dva broja: ");
				int a = input.nextInt();
				int b = input.nextInt();
				int result = a + b;
				System.out.println(a + " + " + b + " je " + result);
				isOK = false;
			} catch (InputMismatchException exc) {
				System.out.println("Niste unijeli broj! Pokusajte ponovo: ");
				input.nextLine(); 
			}
		} while (isOK);
		input.close();
	}

}
