/**(Mersenne prime) A prime number is called a Mersenne prime if it can be written
in the form 2p - 1 for some positive integer p. Write a program that finds
all Mersenne primes with p … 100 and displays the output as shown below.
(Hint: You have to use BigInteger to store the number, because it is too big to
be stored in long. Your program may take several hours to run.)
p 2^p – 1
2 3
3 7
5 31
...*/
package zadaci_08_02_2016;

import java.math.*;

public class MarsennePrime {
	public static boolean prostBroj(long a) {
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		for (int i = 2; i < 100; i++) {
			if (prostBroj(i)) {
				BigInteger a = new BigInteger("2").pow(i).subtract(new BigInteger("1"));
				// long a = (long) (Math.pow(2, i) - 1);
				System.out.println("p = "+i+" |"+a);

			}
		}

	}

}
