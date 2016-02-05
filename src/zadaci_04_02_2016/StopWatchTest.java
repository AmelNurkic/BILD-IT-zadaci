package zadaci_04_02_2016;

import java.util.*;

public class StopWatchTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StopWatch SW = new StopWatch();
		int start = -1;
		int stop = -1;
		while (start != 1) {
			System.out.println("Unesite 1 za startanje stoperice: ");
			start = input.nextInt();
			SW.start();
		}
		while (stop != 0) {
			System.out.println("Unesite 0 za stopiranje stoperice: ");
			stop = input.nextInt();
			SW.stop();
		}
		System.out.println("Elapsed time: " + SW.getElapsedTime()+" seconds.");
		input.close();
	}

}
