/**(Sum the digits in an integer using recursion) Write a recursive method that
computes the sum of the digits in an integer. Use the following method header:
public static int sumDigits(long n)
For example, sumDigits(234) returns 2 + 3 + 4 = 9. Write a test program
that prompts the user to enter an integer and displays its sum.*/
package zadaci_23_02_2016;

public class SumOfDigits {

	public static int sumDigits(long n) {
		long sum = 0;
		if (n == 0)
			return (int) n;
		sum = sum + (n % 10);
		return (int) sum + sumDigits(n / 10);

	}

	public static void main(String[] args) {
		System.out.println(sumDigits(234));

	}

}
