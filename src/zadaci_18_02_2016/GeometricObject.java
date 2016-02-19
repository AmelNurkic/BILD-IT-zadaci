package zadaci_18_02_2016;

import java.util.*;

public abstract class GeometricObject {

	/** Arguments */
	private String color;
	private boolean filled;
	private Date dateCreated;

	/** Empty constructor */
	public GeometricObject() {
		this.dateCreated = new Date();
	}

	/** Constructor with the specified color and filled value */
	public GeometricObject(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
		this.dateCreated = new Date();
	}

	/** Return GO color */
	public String getColor() {
		return color;
	}

	/** Set GO color */
	public void setColor(String color) {
		this.color = color;
	}

	/** Return filled */
	public boolean isFilled() {
		return filled;
	}

	/** Set filled */
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	/** Get dateCreated */
	public Date getDateCreated() {
		return dateCreated;
	}

	/** Return a string representation of this object */
	public String toString() {
		return "Created on " + dateCreated + "\n Color: " + color + "\n Filled: " + filled;
	}

	/** Get area */
	public abstract double getArea();

	/** Compare GOs */
	public int compareTo(GeometricObject object) {
		if (this.getArea() > object.getArea())
			return 1;
		else if (this.getArea() < object.getArea())
			return -1;
		else
			return 0;
	}

	/** Max GO */
	public static GeometricObject max(GeometricObject object1, GeometricObject object2) {
		if (object1.compareTo(object2) == 1)
			return object1;
		else
			return object2;
	}

	public void howToColor() {
		// TODO Auto-generated method stub
	}

}
