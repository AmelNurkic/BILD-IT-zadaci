/**(Sort ArrayList) Write the following method that sorts an ArrayList of numbers.
public static void sort(ArrayList<Number> list)*/
package zadaci_17_02_2016;

import java.util.*;

public class SortArrayList {
	
	public static void sort(ArrayList<Integer> list){
		Collections.sort(list);
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=100; i>0;i--){
			list.add(i);
		}
		//sort(list);
		for(int i : list){
			System.out.println(i+" ");
		}

	}

}
