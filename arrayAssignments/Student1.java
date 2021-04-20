package arrayAssignments;

public class Student1 {
	
	private int rollNo;
	private String name;
	private double marks;
	
	public Student1() {
		// TODO Auto-generated constructor stub
	}

	public Student1(int rollNo, String name, double marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}
	
}
