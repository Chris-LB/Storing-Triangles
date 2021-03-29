
/**
 * @author Christopher Lara-Betancourt
 * Triangles class- Holds triangle objects in a linked list
 * ICS 372 
 * Dathan Brahma 
 */

import java.util.LinkedList;

public class Triangles {
	private LinkedList<Triangle> triangles = new LinkedList<Triangle>();

	/**
	 * Adds triangle objects into the linked list
	 * 
	 * @param object
	 */
	public void addTriangle(Triangle object) {
		triangles.add(object);
	}

	/**
	 * Takes in a triangle object and if it finds this object in the linked list
	 * then it removes it
	 * 
	 * @param object
	 * @return Triangle object
	 */
	public Triangle delete(Triangle object) {
		LinkedList<Triangle> current = triangles;
		if (current.remove(object)) {
			triangles = current;
			return object;
		}
		return null;
	}

	/**
	 * Take in an integer and if it finds an ID that matches the integer then it
	 * returns a triangle object
	 * 
	 * @param id
	 * @return Triangle object
	 */
	public Triangle getTriangle(int id) {
		for (int i = 0; i < triangles.size(); i++) {
			if (triangles.get(i).getID() == id) {
				return triangles.get(i);
			}
		}
		return null;
	}

	@Override
	public String toString() {
		String decription = "";
		int number = 1;
		for (int index = 0; index < triangles.size(); index++) {
			decription += "This is triangle " + number + "\n";
			decription += triangles.get(index).toString() + "\n";
			number++;
		}
		return decription;
	}

}
