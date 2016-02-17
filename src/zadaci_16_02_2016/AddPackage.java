/**(Add package statement) Suppose you have Java source files under the directories
chapter1, chapter2, . . . , chapter34. Write a program to insert the
statement package chapteri; as the first line for each Java source file under
the directory chapteri. Suppose chapter1, chapter2, . . . , chapter34
are under the root directory srcRootDirectory. The root directory and
chapteri directory may contain other folders and files. */
package zadaci_16_02_2016;

import java.io.File;
import java.io.PrintWriter;
import java.nio.file.Files;

public class AddPackage {

	public static void main(String[] args) {
		File root = new File("root");
		if (!root.isDirectory()) {
			System.out.println("Root directory does not exists");
		}
		File[] chapters = new File[34];
		File[] dir = new File[34];
		for (int i = 0; i < 34; i++) {
			dir[i] = new File("root\\chapter" + (i + 1));
			dir[i].mkdir();
			chapters[i] = new File("root\\chapter" + (i + 1) + "\\chapter" + (i + 1));
			try (PrintWriter output = new PrintWriter(chapters[i])) {
				output.println("Chapter" + i);
			} catch (Exception e) {
				System.out.println("Error!");
			}
		}

	}

}
