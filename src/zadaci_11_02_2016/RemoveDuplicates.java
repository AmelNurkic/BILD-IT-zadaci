/**(Remove duplicates) Write a method that removes the duplicate elements from
an array list of integers using the following header:
public static void removeDuplicate(ArrayList<Integer> list)
Write a test program that prompts the user to enter 10 integers to a list and displays
the distinct integers separated by exactly one space.*/
package zadaci_11_02_2016;

import java.util.*;

public class RemoveDuplicates {
	public static void removeDuplicate(ArrayList<Integer> list) {
		Set<Integer> hashset = new HashSet<>();
		hashset.addAll(list);
		list.clear();
		list.addAll(hashset);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite 10 brojeva: ");
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			int a = input.nextInt();
			list.add(a);
		}
		System.out.println("Puna lista: ");
		for (int i : list) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("Bez duplikata: ");
		removeDuplicate(list);
		for (int i : list) {
			System.out.print(i + " ");
		}
		input.close();

	}

}
