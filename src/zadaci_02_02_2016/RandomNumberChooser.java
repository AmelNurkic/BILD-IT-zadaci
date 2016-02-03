/**(Random number chooser) Write a method that returns a random number between
1 and 54, excluding the numbers passed in the argument. The method header is
specified as follows:
public static int getRandom(int... numbers)*/
package zadaci_02_02_2016;

import java.util.*;

public class RandomNumberChooser {
	// startC
	// https://forum.processing.org/one/topic/random-int-with-exclude.html
	public static int getRandom(int[] exclude) {
		Arrays.sort(exclude);
		int num0_54 = 0;
		do {
			num0_54 = (int) (Math.random() * 54) + 1;
		} while (Arrays.binarySearch(exclude, num0_54) > 0);
		return num0_54;
	}
	// endC

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 23, 24, 25, 26, 27, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22,
				28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40 };
		System.out.println(getRandom(arr));
	}

}