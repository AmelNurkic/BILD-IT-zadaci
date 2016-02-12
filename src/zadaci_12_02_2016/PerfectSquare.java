package zadaci_12_02_2016;

import java.util.*;

public class PerfectSquare {
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		Scanner input = new Scanner(System.in);
		int[] array = new int[100];
		System.out.println("Insert m : ");
		int m = input.nextInt();
		int m1 = m;

		for (int i = 2; i < m; i++) {
			while (m % i == 0) {
				list.add(i);
				m /= i;
			}
		}

		for (int i : list) {
			array[i]++;
		}

		int n = 1;
		for (int i = 0; i < 100; i++) {
			if (array[i] % 2 != 0)
				n = n * i;
		}
		System.out.println("The smallest number n for m * n to be perfect square is " + n);
		System.out.println("m * n is: " + (m1 * n));
		input.close();

	}
}
