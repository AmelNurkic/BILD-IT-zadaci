package zadaci_06_02_2016;

import java.util.*;

public class PrimeUnder120Dec {

	public static void main(String[] args) {
		System.out.println("All the prime numbers less than 120 in decreasing order... ");

		Stack<Integer> stack = new Stack<Integer>();

		for (int i = 2; i < 120; i++) {
			if (isPrime(i)) {
				stack.push(i);
			}
		}
		while (!stack.empty()) {
			System.out.println(stack.pop());
		}
	}

	public static boolean isPrime(int a) {
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				return false;
			}
		}
		return true;
	}

}
