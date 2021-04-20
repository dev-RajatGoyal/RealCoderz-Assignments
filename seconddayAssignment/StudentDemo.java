package seconddayAssignment;

import java.util.Scanner;

public class StudentDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter details of student1");
		Student one = new Student(sc.nextInt(), sc.next(), sc.nextDouble()); 
		System.out.println("enter details of student2");
		Student two = new Student(sc.nextInt(), sc.next(), sc.nextDouble()); 
		System.out.println("enter details of student3");
		Student three = new Student(sc.nextInt(), sc.next(), sc.nextDouble());
		System.out.println("Student with highest marks is " +
				compareStudents(one, two, three));

	}
	
	public static String compareStudents(Student one, Student two, Student three)
	{
		Student st = one;

		if(two.getMarks() >st.getMarks())
		st = two;

		if(three.getMarks() > st.getMarks())
		st = three;

		return st.getName();

	}
}
