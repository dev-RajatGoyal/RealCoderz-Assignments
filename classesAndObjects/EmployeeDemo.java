package classesAndObjects;

import java.util.Scanner;

public class EmployeeDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter empployee id");
		int id = sc.nextInt();
		System.out.println("Enter empployee name");
		String name = sc.next();
		System.out.println("Enter empployee department name");
		String dept = sc.next();
		System.out.println("Enter empployee salary");
		int salary = sc.nextInt();
		Employee emp = new Employee(id,name,dept,salary);
		
		System.out.println("Id "+emp.getEmpNo());
		System.out.println("Name "+emp.getName());
		System.out.println("Department "+emp.getDept());
		System.out.println("Salary "+emp.getSalary());
	}
}
