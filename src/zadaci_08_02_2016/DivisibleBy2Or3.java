/**(Divisible by 2 or 3) Find the first ten numbers with 50 decimal digits that are
divisible by 2 or 3.*/
package zadaci_08_02_2016;

import java.math.*;
import java.util.ArrayList;

public class DivisibleBy2Or3 {

	public static void main(String[] args) {
		String one = "1";
		while (one.length() < 50) {
			one = one + "0";
		}
		int count = 0;
		BigInteger big = new BigInteger(one);

		ArrayList<BigInteger> list = new ArrayList<BigInteger>();
		while (count < 10) {

			if (big.remainder(new BigInteger("2")).equals(new BigInteger("0")) || big.remainder(new BigInteger("3")).equals(new BigInteger("0"))) {
				count++;
				list.add(big);

			}
			big = big.add(new BigInteger("1"));
		}
		for (BigInteger i : list) {
			System.out.println(i);
		}

	}
}
