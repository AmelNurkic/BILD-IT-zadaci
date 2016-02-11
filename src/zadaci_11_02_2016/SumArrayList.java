/**(Sum ArrayList) Write the following method that returns the sum of all numbers
in an ArrayList:
public static double sum(ArrayList<Double> list)
Write a test program that prompts the user to enter 5 numbers, stores them in an
array list, and displays their sum.*/
package zadaci_11_02_2016;

import java.util.*;

public class SumArrayList {
	public static double sum(ArrayList<Double> list) {
		double sum = 0;
		for (double i : list) {
			sum = sum + i;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Double> list = new ArrayList<Double>();
		System.out.println("Enter 5 numbers: ");
		for (int i = 0; i < 5; i++) {
			double a = input.nextDouble();
			list.add(a);
		}
		for (double i : list) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("Suma liste je " + sum(list));
		input.close();
	}

}
