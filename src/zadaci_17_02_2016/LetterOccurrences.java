package zadaci_17_02_2016;

import java.util.*;
import java.io.*;

public class LetterOccurrences {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Enter name of file: ");
		String a = ulaz.next();
		File file = new File(a);
		if (!file.exists()) {
			System.out.println("File does not exist.");
		}
		char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		int[] count = new int[alphabet.length];
		try (Scanner input = new Scanner(file)) {
			while (input.hasNextLine()) {
				String s = input.next();
				s.toLowerCase();
				char[] c = s.toCharArray();
				for (int i = 0; i < c.length; i++) {
					for (int j = 0; j < alphabet.length; j++) {
						if (c[i] == alphabet[j]) {
							count[j]++;
						}
					}

				}
			}

		} catch (Exception e) {
			System.out.println("Error");
		}
		for(int i=0; i<count.length;i++){
			System.out.println("Slovo "+alphabet[i]+" se pojavilo "+count[i]+" puta");
		}

	}

}
