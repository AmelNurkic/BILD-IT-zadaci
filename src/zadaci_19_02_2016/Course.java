/**(Enable the Course class cloneable) Rewrite the Course class in Listing 10.6
to add a clone method to perform a deep copy on the students field.*/
package zadaci_19_02_2016;

public class Course implements Cloneable {

	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;

	public Course(String courseName) {
		this.courseName = courseName;
	}

	public void addStudent(String student) {
		students[numberOfStudents] = student;
		numberOfStudents++;
	}

	public String[] getStudents() {
		return students;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public String getCourseName() {
		return courseName;
	}

	public void dropStudent(String student) {
		// Left as an exercise in Programming Exercise 10.9
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();

	}
}
