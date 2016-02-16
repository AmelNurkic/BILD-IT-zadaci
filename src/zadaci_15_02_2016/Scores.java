/**(Process scores in a text file) Suppose that a text file contains an unspecified
number of scores separated by blanks. Write a program that prompts the user
to enter the file, reads the scores from the file, and displays their total and
average.*/
package zadaci_15_02_2016;
import java.io.*;
import java.util.*;
public class Scores {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter name of the file: ");
		String a = input.next();
		File file = new File(a);
		if(!file.exists()){
			System.out.println("The file does not exist");
			System.exit(1);
		}
		double sum=0;
		double count=0;
		double avg=0;
		try{
			Scanner input2 = new Scanner(file);
			while(input2.hasNext()){
			double score = input2.nextDouble();
			sum = sum+score;
			count++;
			
			}
		}catch(Exception e){
			System.out.println("Error!");
		}
		avg = sum/count;
		System.out.println("Total scores: "+count);
		System.out.println("Sum of all scores: "+sum);
		System.out.println("Average of all scores: "+avg);
		input.close();
	}

}
