package arrayAssignments;

import java.util.Scanner;

public class StudentDemo {
	
	static Student[] students;
	public static void main(String[] args) {
		students = new Student[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<students.length; i++) {
			System.out.println("Enter details of students "+(i+1));
			System.out.println("enter student roll no, student name, student marks");
			students[i] = new Student(sc.nextInt(), sc.next(), sc.nextDouble());
		}
		
		System.out.println("enter character");
		char c = sc.next().charAt(0);
		
		Student[] student = splitStudentArray(students, c);
		for(Student stu : student) {
			if(stu != null)
				System.out.println(stu.getMarks());
			
		}
	}
	
	public static Student[] splitStudentArray(Student[] students, char c) {
		Student[] student = new Student[5];
		for(int i=0; i<students.length; i++) {
			
			 if(c=='o') {
				 if(students[i].getMarks()%2!=0) {
					 student[i] = students[i];
				 }
			 }
			 
			 else if(c=='e') {
				 if(students[i].getMarks()%2==0) {
					 student[i] = students[i];
				 }
			 }
			 
			 else {
				 student[i] = null;
			 }
		 }
		return student;
	}
}
