/**(Area of a convex polygon) A polygon is convex if it contains any line segments
that connects two points of the polygon. Write a program that prompts the user to
enter the number of points in a convex polygon, then enter the points clockwise,
and display the area of the polygon.

Enter the number of the points: 7
Enter the coordinates of the points:
-12 0 -8.5 10 0 11.4 5.5 7.8 6 -5.5 0 -7 -3.5 -3.5
The total area is 250.075
*/
// (X1Y2-Y1X2)+(X2Y3-Y2X3)+...(XnY1-YnX1)/2
package zadaci_12_02_2016;

import java.util.*;

public class AreaOfConvexPolygon {
	public static double polygonArea(double[] X, double[] Y, int numPoints) {
		// inicijalizacija povrsine mnogougla
		double P = 0;
		// primjena formule (X1Y2-Y1X2)+(X2Y3-Y2X3)+...(XnY1-YnX1)/2
		// izostavljamo zadnje clanove da ne bi dobili "Index out of
		// bounds...bla bla"
		for (int i = 0; i < numPoints - 1; i++) {
			P = P + ((X[i] * Y[i + 1]) - (Y[i] * X[i + 1]));
		}
		// zadnji i prvi clanovi
		P = P + ((X[numPoints - 1] * Y[0]) - (Y[numPoints - 1] * X[0]));
		P = Math.abs(P);
		return P / 2;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean isOK = true;
		do {
			try {
				System.out.println("Enter the number of the points : ");
				int a = input.nextInt();
				System.out.println("Enter the points clockwise: ");
				double[] Xpoints = new double[a];
				double[] Ypoints = new double[a];
				for (int i = 0; i < a; i++) {
					Xpoints[i] = input.nextDouble();
					Ypoints[i] = input.nextDouble();
				}
				System.out.println("Povrsina mnogougla je: " + polygonArea(Xpoints, Ypoints, a));
				isOK = false;
			} catch (Exception e) {
				System.out.println("Pogresan unos! Pokusajte ponovo: ");
				input.nextLine();
			}
		} while (isOK);
		input.close();
	}

}
