/**(Baby name popularity ranking) The popularity ranking of baby names from
years 2001 to 2010 is downloaded from www.ssa.gov/oact/babynames and stored
in files named babynameranking2001.txt, babynameranking2002.txt, . . . ,
babynameranking2010.txt. Each file contains one thousand lines. Each line
contains a ranking, a boy’s name, number for the boy’s name, a girl’s name,
and number for the girl’s name. For example, the first two lines in the file
babynameranking2010.txt are as follows:
So, the boy’s name Jacob and girl’s name Isabella are ranked #1 and the boy’s
name Ethan and girl’s name Sophia are ranked #2. 21,875 boys are named
Jacob and 22,731 girls are named Isabella. Write a program that prompts the
user to enter the year, gender, and followed by a name, and displays the ranking
of the name for the year.*/
package zadaci_17_02_2016;

import java.io.*;
import java.util.*;

public class BabyNames {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int year = 0;
		String gender = "";
		boolean boo = true;
		while (boo) {
			try {
				System.out.print("Enter year(must be 1880 or later): ");
				year = input.nextInt();
				if (year > 1879) {
					boo = false;
				}
			} catch (InputMismatchException e) {
				System.out.println("Wrong input. Try again.");
				input.nextLine();
			}
		}
		boo = true;
		while (boo) {
			try {
				System.out.print("Enter gender(M or F): ");
				gender = input.next();
				if (gender.equals("M") || gender.equals("F")) {
					boo = false;
				}
			} catch (InputMismatchException e) {
				System.out.println("Wrong input. Try again.");
				input.nextLine();
			}
		}
		boo = true;
		System.out.print("Enter name: ");
		String name = input.next();
		File file = new File("babynamesranking" + year + ".txt");
		if (!file.exists()) {
			System.out.println("File does not exist or there is no data for that year.");
			System.exit(1);
		}
		int rank = 0;
		try (Scanner input2 = new Scanner(file)) {
			while (input2.hasNextLine()) {
				int ranking = input2.nextInt();
				String maleName = input2.next();
				String femaleName = input2.next();
				if (maleName.equals(name) || femaleName.equals(name)) {
					rank = ranking;
				}

			}
			input2.close();

		} catch (Exception e) {
			System.out.println("Error");
		}
		if (rank == 0) {
			System.out.println("The name is not ranked in this year.");
		} else
			System.out.println(name + " is ranked " + "#" + rank + " in year " + year);

	}

}
