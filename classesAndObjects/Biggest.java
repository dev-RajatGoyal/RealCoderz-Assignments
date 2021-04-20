package classesAndObjects;

import java.util.Scanner;

public class Biggest {
	static int[] array = new int[5];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			System.out.println("enter " + (i + 1) + " element");
			array[i] = sc.nextInt();
		}
		display(array);
	}

	public static void display(int[] array) {

		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}

		System.out.println("largest element of the array " + max);
	}
}
