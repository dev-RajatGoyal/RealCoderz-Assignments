package classesAndObjects;

public class Employee {
	
	private int empNo;
	private String name;
	private String dept;
	private int salary;
	
	public Employee(int empNo, String name, String dept, int salary) {
		super();
		this.empNo = empNo;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}

	public int getEmpNo() {
		return empNo;
	}


	public String getName() {
		return name;
	}

	public String getDept() {
		return dept;
	}

	public int getSalary() {
		return salary;
	}

	
	
}
