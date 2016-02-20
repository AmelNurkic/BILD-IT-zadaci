/**(Enable the Course class cloneable) Rewrite the Course class in Listing 10.6
to add a clone method to perform a deep copy on the students field.*/
package zadaci_19_02_2016;

public class CourseTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Course c1 = new Course("Some course");
		c1.addStudent("Some student");
		c1.addStudent("Some student2");
		Course c2 = (Course) c1.clone();

		System.out.println(c2.getCourseName());
		String[] students2 = c2.getStudents();
		for (int i = 0; i < students2.length; i++) {
			if (students2[i] == null) {
			} else
				System.out.println(students2[i] + " ");
		}

	}

}
