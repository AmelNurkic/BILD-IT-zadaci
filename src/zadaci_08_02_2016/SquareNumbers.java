/**(Square numbers) Find the first ten square numbers that are greater than
Long.MAX_VALUE. A square number is a number in the form of n2. For example,
4, 9, and 16 are square numbers. Find an efficient approach to run your
program fast.*/
package zadaci_08_02_2016;

import java.math.*;

public class SquareNumbers {
	public static void main(String[] args) {
		BigInteger max = new BigInteger("" + Long.MAX_VALUE);
		long first = (long) Math.sqrt(Long.MAX_VALUE);
		BigInteger firstBig = new BigInteger("" + first);
		int count = 0;
		while (count < 10) {
			BigInteger square = firstBig.multiply(firstBig);
			if (square.compareTo(max) > 0) {
				count++;
				System.out.println(square);
			}
			firstBig = firstBig.add(BigInteger.ONE);

		}
	}

}
