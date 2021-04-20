package firstdayAssignment;

import java.util.Scanner;

public class HollowAreaDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter outer radius");
		double outerRadius = sc.nextDouble();
		System.out.println("Enter inner radius");
		double innerRadius = sc.nextDouble();
		System.out.println("Enter height");
		double height = sc.nextDouble();
		double area = calculateHollowArea(outerRadius,innerRadius,height);
		System.out.println("Area of Hollow = "+area);
	}
	
	public static double calculateHollowArea(double outerRadius, double innerRadius, double height)
	{
		double area = 0;
		double l1 = outerRadius + innerRadius;
		double l2 = outerRadius - innerRadius + height;
		area = (2*3.14) * (l1) * (l2);
		return area;		
	}
}
