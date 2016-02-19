package zadaci_18_02_2016;

import java.util.Arrays;

public class CircleTest {

	public static void main(String[] args) {

		GeometricObject[] circles = { new Circle("yellow", true, 5), new Circle("red", true, 6), new Circle("blue", true, 3) };
		Arrays.sort(circles);
		for(GeometricObject circle : circles){
			System.out.println(circle.toString()+" ");
		}

	}

}
