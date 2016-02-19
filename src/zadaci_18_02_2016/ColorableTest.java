/**Write a test program that creates an array of five GeometricObjects. For each
object in the array, display its area and invoke its howToColor method if it is
colorable.*/
package zadaci_18_02_2016;

public class ColorableTest {

	public static void main(String[] args) {
	     GeometricObject[] geoShapes = new GeometricObject[5];
	        geoShapes[0] = new Square("yellow",false,4);
	        geoShapes[1] = new Circle();
	        geoShapes[2] = new Square();
	        geoShapes[3] = new Circle("red", true, 5);
	        geoShapes[4] = new Square("purple",true, 3);

	        for (int i = 0; i < geoShapes.length; i++) {

	            System.out.println("Object #" + (i + 1));
	            if (geoShapes[i] instanceof Colorable) {
	                geoShapes[i].howToColor();
	            }
	        }

	    }



	}
