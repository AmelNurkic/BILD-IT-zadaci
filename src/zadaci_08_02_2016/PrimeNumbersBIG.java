/**(Large prime numbers) Write a program that finds five prime numbers larger
than Long.MAX_VALUE.*/
package zadaci_08_02_2016;

import java.math.BigInteger;

public class PrimeNumbersBIG {

	public static boolean prostBroj(int a) {
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean primeBIG(BigInteger a) {
		for (BigInteger i = new BigInteger("" + Long.MAX_VALUE); i.compareTo(a) < 0; i.add(BigInteger.ONE)) {
			if (a.remainder(i).equals(BigInteger.ZERO)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		BigInteger max = new BigInteger(""+Long.MAX_VALUE);
		int count =0;
		while (count<6){
			if(max.isProbablePrime(1)){
				System.out.println(max);
				count++;
			}
			max = max.add(BigInteger.ONE);
		}

	}

}
