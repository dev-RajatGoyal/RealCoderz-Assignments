package arrayAssignments;

import java.util.Scanner;

public class SorterDemo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] array = new double[5];
		System.out.println("enter 5 elements in array");
		for(int i=0; i<array.length; i++) {
			array[i] = sc.nextDouble();
		}
		
		String str = "realcoderz";
		Student1[] students = new Student1[3];
		for(int i=0; i<students.length; i++) {
			System.out.println("enter detials of student "+(i+1));
			System.out.println("enter roll no, name, marks");
			students[i] = new Student1(sc.nextInt(), sc.next(), sc.nextDouble());
		}
		
		double[] sortedArray = sortDouble(array);
		for(double d : sortedArray) {
			System.out.println(d);
		}
		sortString(str);
		Student1[] student = sortStudent(students);
		for(Student1 stu : student) {
			System.out.println();
			System.out.println(stu.getRollNo());
			System.out.println(stu.getName());
			System.out.println(stu.getMarks());
		}
	}
	
	public static double[] sortDouble(double[] array) {
		int count = 0;
		double temp;
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array.length-1; j++) {
				if(array[j] > array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		
		return array;
		
	}
	
	public static void sortString(String str) {
		char[] array = str.toCharArray();
		int count = 0;
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array.length-1; j++) {
				if(array[j] > array[j+1]) {
					char temp  = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		
		for(char c : array) {
			System.out.print(c);
		}

	}
	
	public static Student1[] sortStudent(Student1[] students) {
		for(int i=0; i<students.length; i++) {
			for(int j=0; j<students.length-1; j++) {
				if(students[j].getMarks() > students[j+1].getMarks()) {
					double temp = students[j].getMarks();
					students[j].setMarks(students[j+1].getMarks());
					students[j+1].setMarks(temp);
				}
			}
		}
		
		return students;
	}
	
}
