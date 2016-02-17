/**(Count words) Write a program that counts the number of words in President
Abraham Lincoln’s Gettysburg address from http://cs.armstrong.edu/liang/data/
Lincoln.txt.*/
package zadaci_16_02_2016;

import java.io.*;
import java.util.*;
import java.net.*;

public class CountWords {

	public static void main(String[] args) {

		String lincoln = "http://cs.armstrong.edu/liang/data/Lincoln.txt";
		int count = 0;
		try {
			URL url = new URL(lincoln);
			Scanner input = new Scanner(url.openStream());
			while (input.hasNextLine()) {
				String a = input.nextLine();
				count = count + a.length();
			}
			System.out.println("There are " + count + " word in this text.");

		} catch (MalformedURLException ex) {
			System.out.println("Wrong URL");
		} catch (java.io.IOException ex) {
			System.out.println("No such file");
		} catch (Exception e) {
			System.out.println("Error!");
		}
	}

}
