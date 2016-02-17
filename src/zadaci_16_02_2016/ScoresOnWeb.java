/**(Process scores in a text file on the Web) Suppose that the text file on the
Web http://cs.armstrong.edu/liang/data/Scores.txt contains an unspecified number
of scores. Write a program that reads the scores from the file and displays their
total and average. Scores are separated by blanks.*/
package zadaci_16_02_2016;

import java.io.*;
import java.util.*;
import java.net.*;

public class ScoresOnWeb {

	public static void main(String[] args) {
		String web = "http://cs.armstrong.edu/liang/data/Scores.txt";
		double total = 0;
		double average = 0;
		double sum = 0;
		try {
			URL scores = new URL(web);
			Scanner input = new Scanner(scores.openStream());
			while (input.hasNextLine()) {
				double a = input.nextDouble();
				total++;
				sum = sum + a;
			}
			average = sum / total;
			System.out.println("Total: " + total);
			System.out.println("Average: " + average);

		} catch (MalformedURLException ex) {
			System.out.println("Wrong URL");
		} catch (java.io.IOException ex) {
			System.out.println("No such file");
		} catch (Exception e) {
			System.out.println("Error!");
		}

	}

}
