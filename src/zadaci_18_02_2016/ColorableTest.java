/**Write a test program that creates an array of five GeometricObjects. For each
object in the array, display its area and invoke its howToColor method if it is
colorable.*/
package zadaci_18_02_2016;

public class ColorableTest {

	public static void main(String[] args) {
	     GeometricObject[] GOs = new GeometricObject[5];
	        GOs[0] = new Square("yellow",false,4);
	        GOs[1] = new Circle();
	        GOs[2] = new Square();
	        GOs[3] = new Circle("red", true, 5);
	        GOs[4] = new Square("purple",true, 3);

	        for (int i = 0; i < GOs.length; i++) {

	            System.out.println("Object #" + (i + 1));
	            if (GOs[i] instanceof Colorable) {
	                GOs[i].howToColor();
	            }
	        }

	    }



	}
