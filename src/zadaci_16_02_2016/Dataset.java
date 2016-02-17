/**(Create large dataset) Create a data file with 1,000 lines. Each line in the file
consists of a faculty member’s first name, last name, rank, and salary. The
faculty member’s first name and last name for the ith line are FirstNamei and
LastNamei. The rank is randomly generated as assistant, associate, and full.
The salary is randomly generated as a number with two digits after the decimal
point. The salary for an assistant professor should be in the range from 50,000
to 80,000, for associate professor from 60,000 to 110,000, and for full professor
from 75,000 to 130,000. Save the file in Salary.txt. Here are some sample data:
FirstName1 LastName1 assistant 60055.95
FirstName2 LastName2 associate 81112.45
. . .
FirstName1000 LastName1000 full 92255.21*/
package zadaci_16_02_2016;

import java.io.*;
import java.util.*;

public class Dataset {

	public static void main(String[] args) {
		File file = new File("Salary.txt");
		if (file.exists()) {
			System.out.println("File already exist.");
			System.exit(1);
		}
		Random random = new Random();
		String[] ranks = { "assistant", "associate", "full" };
		try (PrintWriter output = new PrintWriter(file)) {
			for (int i = 0; i < 1000; i++) {
				String firstName = "FirstName" + (i + 1);
				String lastName = "LastName" + (i + 1);
				int index = random.nextInt(ranks.length);
				String rank = ranks[index];
				int salary = 0;
				int assistantSalary = 50000 + (int) (Math.random() * 30000);
				int associateSalary = 60000 + (int) (Math.random() * 50000);
				int fullSalary = 75000 + (int) (Math.random() * 55000);
				if (rank == "assistant") {
					salary = assistantSalary;
				} else if (rank == "full") {
					salary = associateSalary;
				} else if (rank == "associate") {
					salary = fullSalary;
				}
				String write = firstName + " " + lastName + " " + rank + " " + salary;
				output.println(write);
			}
		} catch (Exception e) {
			System.out.println("Error!");
		}

	}

}
