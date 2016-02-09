/**(Divisible by 5 or 6) Find the first ten numbers greater than Long.MAX_VALUE
that are divisible by 5 or 6.*/
package zadaci_08_02_2016;

import java.math.*;

public class DivisibleBy5Or6BIG {

	public static void main(String[] args) {
		BigInteger max = new BigInteger("" + Long.MAX_VALUE);
		BigInteger big = max.add(BigInteger.ONE);
		int count = 0;
		while (count < 10) {
			if (big.remainder(new BigInteger("5")).equals(BigInteger.ZERO)
					|| big.remainder(new BigInteger("6")).equals(BigInteger.ZERO)) {
				System.out.println(big);
				count++;
			}
			big = big.add(BigInteger.ONE);
		}

	}

}
