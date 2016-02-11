/**(Combine two lists) Write a method that returns the union of two array lists of
integers using the following header:
public static ArrayList<Integer> union(
ArrayList<Integer> list1, ArrayList<Integer> list2)
For example, the union of two array lists {2, 3, 1, 5} and {3, 4, 6} is
{2, 3, 1, 5, 3, 4, 6}. Write a test program that prompts the user to enter two lists,
each with five integers, and displays their union. The numbers are separated by
exactly one space in the output.*/
package zadaci_11_02_2016;

import java.util.*;

public class CombineTwoLists {
	public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		ArrayList<Integer> unionedList = new ArrayList<Integer>();
		unionedList.addAll(list1);
		unionedList.addAll(list2);
		return unionedList;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		System.out.println("Unesite 5 brojeva: ");
		for (int i = 0; i < 5; i++) {
			int a = input.nextInt();
			list1.add(a);
		}
		System.out.println("Unesite ponovo 5 brojeva za drugu listu: ");
		for (int i = 0; i < 5; i++) {
			int b = input.nextInt();
			list2.add(b);
		}
		ArrayList<Integer> frmr = union(list1, list2);
		System.out.println("Unioned list is : ");
		for (int i : frmr) {
			System.out.print(i + " ");
		}
		input.close();
	}

}
