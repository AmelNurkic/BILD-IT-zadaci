/**(Sum the areas of geometric objects) Write a method that sums the areas of all the
geometric objects in an array. The method signature is:
public static double sumArea(GeometricObject[] a)
Write a test program that creates an array of four objects (two circles and two
rectangles) and computes their total area using the sumArea method.*/

package zadaci_19_02_2016;

public class SumAreas {

	public static double sumArea(GeometricObject[] a){
		double sum=0;
		for(int i=0; i<a.length;i++){
			sum = sum + a[i].getArea();
		}
		return sum;
	}

	public static void main(String[] args) {
		GeometricObject [] GOs = {new Circle(9), new Circle(12), new Rectangle(5,6), new Rectangle(8,9)};
		System.out.println("Sum of GOs areas is: "+sumArea (GOs));

	}

}
