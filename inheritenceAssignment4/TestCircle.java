package inheritenceAssignment4;

public class TestCircle {
	public static void main(String[] args) {
		Shape shape = new Circle();
		double area = shape.getArea(10);
		System.out.println("Area of cirlce is "+area);
	}
}
