/**(Count single digits) Write a program that generates 100 random integers between
0 and 9 and displays the count for each number. (Hint: Use an array of ten integers,
say counts, to store the counts for the number of 0s, 1s, . . . , 9s.)*/
package zadaci_02_02_2016;

public class CountSingleDigits {

	public static void main(String[] args) {
		int[] digits = new int[100];
		int[] count = new int[10];
		for (int i = 0; i < digits.length; i++) {
			int num = (int) (Math.random() * 10);
			count[num]++;
		}
		for (int i = 0; i < 10; i++) {
			System.out.println("Broj " + i + " se ponovio " + count[i]);

		}
	}

}
