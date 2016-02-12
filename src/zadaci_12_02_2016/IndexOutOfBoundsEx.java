/**(ArrayIndexOutOfBoundsException) Write a program that meets the following
requirements:
■ Creates an array with 100 randomly chosen integers.
■ Prompts the user to enter the index of the array, then displays the corresponding
element value. If the specified index is out of bounds, display the
message Out of Bounds.*/
package zadaci_12_02_2016;

import java.util.*;

public class IndexOutOfBoundsEx {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] array = new int[100];
		for (int i = 0; i < 100; i++) {
			array[i] = (int) (Math.random() * 100);
		}
		boolean isOK = true;
		do {
			try {
				System.out.println("Unesite broj od 1 do 100");
				int a = input.nextInt();
				a = a - 1;
				System.out.println("Broj koji ste odabrali je " + array[a]);
				isOK = false;
			} catch (ArrayIndexOutOfBoundsException ex) {
				System.out.println("Niste unijeli broj od 1 do 100. Pokusajte ponovo: ");
				input.nextLine();
			}
		} while (isOK);
		input.close();
	}

}
