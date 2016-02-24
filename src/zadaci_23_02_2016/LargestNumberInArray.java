/**Find the largest number in an array - Write a recursive method that returns the
largest integer in an array. Write a test program that prompts the user to enter a
list of eight integers and displays the largest element.*/
package zadaci_23_02_2016;

import java.util.*;

public class LargestNumberInArray {
	private static int getLargest(int[] array, int low, int high) {
		// if end of array return high
		if (low == array.length) {
			return high;
		}
		// go through array and checking if there is higher number
		if (array[low] > high) {
			high = array[low];
		}
		// go to next number in array
		return getLargest(array, low + 1, high);

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 8 numbers: ");
		int[] numbers = new int[8];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}
		System.out.println("Biggest number of entered is: " + getLargest(numbers, 0, numbers[0]));
		input.close();
	}

}
