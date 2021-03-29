
public class Driver {

	public static void main(String[] args) {
		Point one = new Point(1,2);
		Point two = new Point(0,9);
		Point three = new Point(3,2);
		Point four = new Point(4,5);
		Point five = new Point(4,4);
		Point six = new Point(8,8);
		Point seven = new Point(9,8);
		Point eight = new Point(10,2);
		Point nine = new Point(10,2);
		Triangle first = new Triangle(one,two,three);
		Triangle second = new Triangle(four,five,six);
		Triangle third = new Triangle(seven,eight,nine);
		Triangle fourth = new Triangle();
		Triangle fifth = new Triangle(nine);
		Triangles uno = new Triangles();
		fifth.setPoint(2, eight);
		uno.addTriangle(first);
		uno.addTriangle(second);
		uno.addTriangle(third);
		System.out.println(uno);
		uno.delete(first);
		System.out.println(uno);
		System.out.println(uno.getTriangle(1));
		System.out.println(first.equals(second));
		

	}

}
