/**Assign maximum speed, radius 10, coloryellow, and turn it on to the first object. 
 * Assign medium speed, radius 5, colorblue, and turn it off to the second object. 
 * Display the objects by invoking their toString method.*/
package zadaci_05_02_2016;

public class FanTest {
	public static void main(String[] args) {

		Fan fan1 = new Fan();
		fan1.getFAST();
		fan1.setRadius(10);
		fan1.setColor("yellow");
		fan1.setOn(true);
		System.out.println(fan1.toString());
		Fan fan2 = new Fan();
		fan2.getMEDIUM();
		fan2.setRadius(5);
		fan2.setColor("blue");
		fan2.setOn(false);
		System.out.println(fan2.toString());
	}
}
