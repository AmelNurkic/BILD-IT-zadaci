package Mini_projekt2;

import java.util.*;

public class Kartica {

	/** Return true if the card number is valid */
	public static boolean isValid(long number) {
		int zbir = sumOfDoubleEvenPlace(number) + zbirParnih(number);
		if (zbir % 10 == 0) {
			return true;
		}
		return false;
	}

	/** Zbir parnih brojeva na kartici */
	public static int zbirParnih(long number) {
		String a = "" + number;
		char[] b = a.toCharArray();
		int zbir = 0;
		for (int i = 0; i < b.length; i++) {
			if (i % 2 != 0) {
				zbir = zbir + Character.getNumericValue(b[i]);
			}
		}
		return zbir;
	}

	/** Get the result from Step 2 */
	public static int sumOfDoubleEvenPlace(long number) {
		String a = "" + number;
		char[] b = a.toCharArray();
		int zbir = 0;
		for (int i = 0; i < b.length; i++) {
			if (i % 2 == 0) {
				zbir = zbir + getDigit(2 * (Character.getNumericValue(b[i])));
			}
		}
		return zbir;
	}

	/**
	 * Return this number if it is a single digit, otherwise, return the sum of
	 * the two digits
	 */
	public static int getDigit(int number) {
		int zbir = 0;
		if (number < 10 && number > -1) {
			return number;
		} else if (number > 9 && number < 19) {
			String a = "" + number;
			char[] b = a.toCharArray();
			for (int i = 0; i < b.length; i++) {
				zbir = zbir + Character.getNumericValue(b[i]);
			}
		}
		return zbir;
	}

	/** Return sum of odd-place digits in number */
	public static int sumOfOddPlace(long number) {
		String a = "" + number;
		char[] b = a.toCharArray();
		int zbir = 0;
		for (int i = 0; i < b.length; i++) {
			if (i % 2 == 0) {
				zbir = zbir + Character.getNumericValue(b[i]);
			}
		}
		return zbir;
	}

	/** Return true if the digit d is a prefix for number */
	public static boolean prefixMatched(long number, int d) {
		String a = "" + d;
		String b = "" + number;
		if (b.contains(a)) {
			return true;
		}
		return false;
	}

	/** Return the number of digits in d */
	public static int getSize(long d) {
		String a = "" + d;
		int b = a.length();
		return b;
	}

	/**
	 * Return the first k number of digits from number. If the number of digits
	 * in number is less than k, return number.
	 */
	public static long getPrefix(long number, int k) {
		if (k > getSize(number)) {
			return number;
		} else {
			int a = getSize(number);
			for (int i = 0; i < (a - k); i++) {
				number = number / 10;
			}
			return number;
		}

	}

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite broj kartice: ");
		long a = ulaz.nextLong();
		if (isValid(a)) {
			System.out.println("Vasa kartica je validna.");
		} else {
			System.out.println("Vasa kartica nije validna.");
		}
		ulaz.close();
	}

}
