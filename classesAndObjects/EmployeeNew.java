package classesAndObjects;

import java.util.Scanner;

public class EmployeeNew {
	
	private int empNo;
	private String name;
	private String department;
	private int salary;


	public EmployeeNew(int empNo, String name, String department, int salary) {
		super();
		this.empNo = empNo;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	
	public EmployeeNew() {
		// TODO Auto-generated constructor stub
	}

	public int getEmpNo() {
		return empNo;
	}
	
	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

	public int getSalary() {
		return salary;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeNew[] employees = new EmployeeNew[10];
		for(int i=0; i<employees.length; i++)
		{
			System.out.println("Enter details of employee "+(i+1)+" \nid, name, department, salary");
			employees[i] = new EmployeeNew(sc.nextInt(), sc.next(), sc.next(), sc.nextInt());
		}
		
		EmployeeNew employee = getHighestSalary(employees);
		System.out.println(employee.getEmpNo());
		System.out.println(employee.getName());
		System.out.println(employee.getDepartment());
		System.out.println(employee.getSalary());
	}
	
	
	public static EmployeeNew getHighestSalary(EmployeeNew[] employees) 
	{
		EmployeeNew employee = new EmployeeNew();
		
		for(int i=0; i<employees.length; i++)
		{
			int max = employees[0].getSalary();
			
			for(int j=1; j<employees.length; j++)
			{
				if(max < employees[j].getSalary()) {
					max = employees[j].getSalary();
					employee = employees[j];
				}
			}
		}
		
		return employee;
	}
}
