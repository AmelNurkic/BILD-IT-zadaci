/**(Count characters, words, and lines in a file) Write a program that will count
the number of characters, words, and lines in a file. Words are separated by
whitespace characters. The file name should be passed as a command-line
argument, as shown in Figure 12.13*/
package zadaci_15_02_2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Counting {

	public static void main(String[] args) throws FileNotFoundException {
		File sourceFile = new File("text.txt");
		if (!sourceFile.exists()) {
			System.out.println("File does not exist");
			System.exit(1);
		}
		int countCh = 0;
		int countWo = 0;
		int countLi = 0;
		try (Scanner input = new Scanner(sourceFile);) {
			while (input.hasNext()) {
				String line = input.nextLine();
				countLi++;
				if (!line.equalsIgnoreCase("")) {
					String replaceAll = line.replaceAll("\\s+", "");
					countCh = countCh + replaceAll.length();
					countWo = countWo + line.split(" ").length;
				}

			}
			input.close();
		}

		System.out.println("Number of chars: " + countCh);
		System.out.println("Number of words: " + countWo);
		System.out.println("Number of lines: " + countLi);
	}

}
