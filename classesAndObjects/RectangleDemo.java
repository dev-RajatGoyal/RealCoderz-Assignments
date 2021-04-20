package classesAndObjects;

import java.util.Scanner;

public class RectangleDemo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length");
		double len = sc.nextDouble();
		System.out.println("Enter width");
		double wid = sc.nextDouble();
		Rectangle rect = new Rectangle();
		rect.setLength(len);
		rect.setWidth(wid);
		System.out.println(rect.calculateAreaa());
	}
}
