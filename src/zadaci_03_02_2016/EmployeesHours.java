/**(Compute the weekly hours for each employee) Suppose the weekly hours for all
employees are stored in a two-dimensional array. Each row records an employee’s
seven-day work hours with seven columns. For example, the following
array stores the work hours for eight employees. Write a program that displays
employees and their total hours in decreasing order of the total hours.*/
package zadaci_03_02_2016;

import java.util.*;

public class EmployeesHours {

	public static String dajDan(int a) {
		switch (a) {
		case 0:
			return "ponedjeljak";
		case 1:
			return "utorak";
		case 2:
			return "srijedu";
		case 3:
			return "cetvrtak";
		case 4:
			return "petak";
		case 5:
			return "subotu";
		case 6:
			return "nedjelju";
		}
		return "Pogresan unos!";
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite broj zaposlenih: ");
		int numberOfEmployees = input.nextInt();
		String[] namesOfEmployees = new String[numberOfEmployees];
		namesOfEmployees[0] = "amel";
		System.out.println("Unesite imena zaposlenih: ");
		
		for (int i = 0; i < numberOfEmployees; i++) {
			namesOfEmployees[i] = input.next();
		}
		int[][] matrix = new int[numberOfEmployees][7];
		System.out.println();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.println("Unesite koliko je " + namesOfEmployees[i] + " imao sati u " + dajDan(j));
				matrix[i][j] = input.nextInt();

			}
		}
		System.out.println("  P  U  S  C  P  S  N");
		for (int i = 0; i < matrix.length; i++) {
			System.out.print(namesOfEmployees[i]);
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print("  " +matrix[i][j]);
			}
			System.out.println();
		}
		input.close();
	}

}
