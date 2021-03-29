
/**
 * @author Christopher Lara-Betancourt 
 * Triangle class - Holds three point objects in an array
 * ICS 372
 * Dathan Brahma 
 */
import java.util.Arrays;

public class Triangle {
	private Point[] point = new Point[3];
	private int id;
	private static int idCounter = 0;

	/**
	 * Takes three point that would make a triangle
	 * 
	 * @param x
	 * @param y
	 * @param z
	 */
	public Triangle(Point x, Point y, Point z) {
		point[0] = x;
		point[1] = y;
		point[2] = z;
		id = idCounter++;

	}

	/**
	 * No argument constructor that sets all three points to null
	 */
	public Triangle() {
		this(null, null, null);
	}

	/**
	 * Takes in a single point and assigneds the other points to null
	 * 
	 * @param x
	 */
	public Triangle(Point x) {
		this(x, null, null);
	}

	/**
	 * Takes an integer and a point object if the index is between 0 and 2 it can
	 * store the object
	 * 
	 * @param index
	 * @param object
	 */
	public void setPoint(int index, Point object) {
		if (index >= 0 && index <= 2) {
			point[index] = object;
		}
	}

	public int getID() {
		return id;
	}

	@Override
	public String toString() {
		String decription = "";
		for (int index = 0; index < 3; index++) {
			decription += point[index].toString() + "\n";
		}
		decription += "Triangle ID = " + getID() + "\n";
		return decription;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + Arrays.hashCode(point);
		return result;
	}

	@Override
	public boolean equals(Object object) {
		Triangle other = (Triangle) object;
		if (object instanceof Triangle) {
			return true;
		}
		if (object == null) {
			return false;
		}
		if (getClass() != object.getClass()) {
			return false;
		}
		if (id != other.id) {
			return false;
		}
		if (!Arrays.equals(point, other.point)) {
			return false;
		}
		return true;
	}

}
