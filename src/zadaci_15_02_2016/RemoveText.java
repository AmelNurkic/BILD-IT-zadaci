/**(Remove text) Write a program that removes all the occurrences of a specified
string from a text file. For example, invoking
java Exercise12_11 John filename
removes the string John from the specified file. Your program should get the
arguments from the command line.*/
package zadaci_15_02_2016;

import java.io.*;
import java.util.*;

public class RemoveText {

	public static void main(String[] args) throws Exception {

		File sourceFile = new File("text.txt");
		if (!sourceFile.exists()) {
			System.out.println("File does not exist");
			System.exit(1);
		}
		File targetFile = new File("text2.txt");
		if (targetFile.exists()) {
			System.out.println("File already exists");
			System.exit(2);
		}

		try (Scanner input = new Scanner(sourceFile); PrintWriter output = new PrintWriter(targetFile);) {
			while (input.hasNext()) {
				String s1 = input.nextLine();
				String s2 = s1.replaceAll("John", "");
				output.println(s2);
			}
		}
	}
}
