/**(Stopwatch) Design a class named StopWatch. The class contains:
■ Private data fields startTime and endTime with getter methods.
■ A no-arg constructor that initializes startTime with the current time.
■ A method named start() that resets the startTime to the current time.
■ A method named stop() that sets the endTime to the current time.
■ A method named getElapsedTime() that returns the elapsed time for the
stopwatch in milliseconds.
Draw the UML diagram for the class and then implement the class. Write a test
program that measures the execution time of sorting 100,000 numbers using
selection sort.*/
package zadaci_04_02_2016;

public class StopWatch {

	// osobine
	public long startTime;
	public long endTime;

	// konstruktori
	public StopWatch() {
		this.startTime = System.currentTimeMillis();
	}
	// metode

	public long getStartTime() {
		return startTime;
	}

	public long getEndTime() {
		return endTime;
	}

	public long start() {
		return startTime = System.currentTimeMillis();
	}

	public long stop() {
		return endTime = System.currentTimeMillis();
	}

	public long getElapsedTime() {
		return (endTime-startTime)/1000;
	}
}
