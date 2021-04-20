package inheritenceAssignment4;

public class TestSquare {
	public static void main(String[] args) {
		ShapeOfSquare square = new Square();
		double area = square.getArea(8);
		System.out.println("Area of square "+area);
	}
}
