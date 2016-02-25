/**(Distinct elements in ArrayList) Write the following method that returns a new
ArrayList. The new list contains the non-duplicate elements from the original list.
public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list)*/
package zadaci_24_02_2016;

import java.util.*;

public class RemoveDuplicatesInArrayList {

	public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
		ArrayList<E> list2 = new ArrayList<E>();
		for (E i : list) {
			if (!list2.contains(i)) {
				list2.add(i);
			}
		}
		return list2;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("Enter 10 numbers: ");
		for (int i = 0; i < 10; i++) {
			int a = input.nextInt();
			list.add(a);
		}
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2 = removeDuplicates(list);
		System.out.println("List without duplicates: ");
		for (int i : list2) {
			System.out.print(i + " ");
		}
		input.close();
	}

}
