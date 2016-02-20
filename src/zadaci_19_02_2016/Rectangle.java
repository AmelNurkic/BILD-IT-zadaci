/**(Enable Rectangle comparable) Rewrite the Rectangle class in Listing 13.3 to
extend GeometricObject and implement the Comparable interface. Override
the equals method in the Object class. Two Rectangle objects are equal
if their areas are the same. Draw the UML diagram that involves Rectangle,
GeometricObject, and Comparable.*/
package zadaci_19_02_2016;

public class Rectangle extends GeometricObject{
	
	//arguments
	double a;
	double b;
	//constructor
	public Rectangle(double a, double b){
		this.a = a;
		this.b = b;
	}
	// methods
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double getArea(){
		return a*b;
	}
	public  boolean equals(Object o){
		if(this.getArea()==((Rectangle)o).getArea()){
			return true;
		}
		return false;
	}

}
