/**(Occurrences of a specified character in a string) Write a recursive method that
finds the number of occurrences of a specified letter in a string using the following
method header:
public static int count(String str, char a)
For example, count("Welcome", 'e') returns 2. Write a test program that
prompts the user to enter a string and a character, and displays the number of
occurrences for the character in the string.*/
package zadaci_23_02_2016;

public class LetterOccurences {

	public static int count(String str, char a) {
		int count = 0;
		// if there is no more letters return count
		if (str.length() == 0)
			return count;
		// checking if last letter of string is a
		char[] characters = str.toCharArray();
		if (characters[characters.length - 1] == a) {
			count++;
		}
		// Delete last letter of string
		str = str.substring(0, str.length() - 1);
		return count + count(str, a);
	}

	public static void main(String[] args) {
		String a = "Welcome";
		System.out.println(count(a, 'e'));

	}

}
