/**(Shuffle ArrayList) Write the following method that shuffles an ArrayList of
numbers:
public static void shuffle(ArrayList<Number> list)*/
package zadaci_17_02_2016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ShuffleArrayList {

	public static void shuffle(ArrayList<Integer> list) {
		Collections.shuffle(list);
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		shuffle(list);
		for (int i : list) {
			System.out.println(i);
		}

	}

}
