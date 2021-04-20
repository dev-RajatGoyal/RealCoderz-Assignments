package inheritenceAssignment4;

class Circle implements Shape{
	
	public double getArea(int radius) {
		double pi = 3.14;
		return (radius*radius*pi);
	}
}