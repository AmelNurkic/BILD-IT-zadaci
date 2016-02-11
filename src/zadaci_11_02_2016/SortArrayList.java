/**(Sort ArrayList) Write the following method that sorts an ArrayList of numbers:
public static void sort(ArrayList<Integer> list)*/
package zadaci_11_02_2016;

import java.util.*;

public class SortArrayList {
	public static void sort(ArrayList<Integer> list) {
		Collections.sort(list);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("Enter 5 numbers: ");
		for (int i = 0; i < 5; i++) {
			int a = input.nextInt();
			list.add(a);
		}
		sort(list);
		for (int i : list) {
			System.out.print(i + " ");
		}
		input.close();

	}

}
