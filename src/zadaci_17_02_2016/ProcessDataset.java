/**(Process large dataset) A university posts its employees’ salaries at http://
cs.armstrong.edu/liang/data/Salary.txt. Each line in the file consists of a faculty
member’s first name, last name, rank, and salary (see Programming Exercise
12.24). Write a program to display the total salary for assistant professors,
associate professors, full professors, and all faculty, respectively, and display
the average salary for assistant professors, associate professors, full professors,
and all faculty, respectively.*/
package zadaci_17_02_2016;

import java.io.*;
import java.math.*;
import java.net.*;
import java.util.*;

public class ProcessDataset {

	public static void main(String[] args) {
		String web = "http://cs.armstrong.edu/liang/data/Salary.txt";
		int count=0;
		int countAssi=0;
		int countAsso=0;
		int countFull=0;
		double sumAssistant = 0;
		double sumAssociate = 0;
		double sumFull = 0;
		double sumAll = 0;
		try {
			URL url = new URL(web);
			Scanner input = new Scanner(url.openStream());
			while (input.hasNextLine()) {

				String name = input.next();
				String lastName = input.next();
				String rank = input.next();
				String salary = input.next();
				double a = Double.parseDouble(salary);
				sumAll = sumAll + a;
				count++;
				if (rank.contains("assistant")) {
					sumAssistant = sumAssistant + a;
					countAssi++;
				} else if (rank.contains("associate")) {
					sumAssociate = sumAssociate + a;
					countAsso++;
				} else if (rank.contains("full")) {
					sumFull = sumFull + a;
					countFull++;
				}
			}
			BigDecimal assist = new BigDecimal("" + sumAssistant);
			BigDecimal associ = new BigDecimal("" + sumAssociate);
			BigDecimal fulls = new BigDecimal("" + sumFull);
			BigDecimal all = new BigDecimal("" + sumAll);
			System.out.println("Assistants total salary: " + assist);
			System.out.println("Associates total salary: " + associ);
			System.out.println("Fulls total salary: " + fulls);
			System.out.println("All total salary:"+all);
			
			System.out.println("Assistants average salary: " + (sumAssistant/countAssi));
			System.out.println("Associates average salary: " + (sumAssociate/countAsso));
			System.out.println("Fulls average salary: " +(sumFull/countFull));
			System.out.println("All average salary:"+(sumAll/count));

		} catch (MalformedURLException ex) {
			System.out.println("Wrong URL");
		} catch (java.io.IOException ex) {
			System.out.println("No such file");
		} catch(Exception e){
			System.out.println("Other error");
		}

	}

}
