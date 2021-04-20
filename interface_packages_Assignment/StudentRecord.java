package interface_packages_Assignment;

import java.util.Scanner;

public class StudentRecord implements Record{
	
	private String studentName;
	private String studentCourseName;
	private int studentMarks;
	
	public StudentRecord() {
		
	}
	
	public StudentRecord(String studentName, String studentCourseName, int studentMarks) {
		super();
		this.studentName = studentName;
		this.studentCourseName = studentCourseName;
		this.studentMarks = studentMarks;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentCourseName() {
		return studentCourseName;
	}

	public void setStudentCourseName(String studentCourseName) {
		this.studentCourseName = studentCourseName;
	}

	public int getStudentMarks() {
		return studentMarks;
	}

	public void setStudentMarks(int studentMarks) {
		this.studentMarks = studentMarks;
	}

	@Override
	public void setRecord(StudentRecord[] students) {
		
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<students.length; i++) {
			System.out.println("Enter details of student "+(i+1)+" \n student name, student course name and student marks");
			students[i] = new StudentRecord(sc.next(), sc.next(), sc.nextInt());
		}
		
	}

	@Override
	public StudentRecord displayRecord(StudentRecord[] students) {
		 
		StudentRecord stuRecord = new StudentRecord();
		
		for(int i=0; i<students.length; i++) {
			int max = students[i].getStudentMarks();
			
			for(int j=1; j<students.length; j++)
			{
				if(max < students[j].getStudentMarks())
				{
					max = students[j].getStudentMarks();
					stuRecord = students[j];
				}
			}
		}
		return stuRecord;
	}

	@Override
	public StudentRecord[] searchRecord(String courseName, StudentRecord[] students) {
		
		StudentRecord[] studentArray = new StudentRecord[students.length];
		int count = 0;
		
		for(StudentRecord stuRecord : students) {
			if(stuRecord.getStudentCourseName().equals(students)) {
				studentArray[count] = stuRecord;
				count++;
			}
		}
		
		return studentArray;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Record record = new StudentRecord();
		StudentRecord[] studentsRecords = new StudentRecord[3];
		
		record.setRecord(studentsRecords);
		
		System.out.println("Press 1 to display the details of student who got highest marks ");
		System.out.println("Press 2 to show the details of those students who associated with same Course ");
		System.out.println("Enter your choice");
		int choice = sc.nextInt();
		
		switch(choice){
		
		case 1:
			StudentRecord stuRecord = record.displayRecord(studentsRecords);
			System.out.println(stuRecord.getStudentName());
			System.out.println(stuRecord.getStudentCourseName());
			System.out.println(stuRecord.getStudentMarks());
			break;
			
		case 2:
			System.out.println("Enter course name");
			String course = sc.next();
			StudentRecord[] stuRecords = record.searchRecord(course, studentsRecords);
			for(StudentRecord stu : stuRecords)
			{
				System.out.println(stu.getStudentName());
				System.out.println(stu.getStudentCourseName());
				System.out.println(stu.getStudentMarks());
			}
			break;
			
			default:
				System.out.println("Please enter valid option");
		}
		
		
	}
}
