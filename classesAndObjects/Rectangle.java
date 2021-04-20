package classesAndObjects;

public class Rectangle {

	private double length = 1;
	private double width = 1;
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double calculateAreaa()
	{
		return length*width;
	}
}	
