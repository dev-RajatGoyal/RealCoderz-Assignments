package interface_packages_Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CourierCompany {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<Employee>();
		
		System.out.println("Enter details of 5 employee");
		for(int i=0; i<5; i++)
		{
			System.out.println("Enter details of employee " + (i+1) +"\nEmployee Id, Employee Name, Employee Salary, Emplpoyee Department and Employee Designation");
			list.add(new Employee(sc.nextInt(), sc.next(), sc.nextInt(), sc.next(), sc.next()));
		}
		
		System.out.println("Press 1 to get details of employee working in Finance Department");
		System.out.println("Press 2 to get details of employee with id");
		System.out.println("Press 3 to show total salary of employee working in Finance Department");
		System.out.println("Press 4 to show total salary of employee working as Manager");
		System.err.println("enter choice");
		int choice = sc.nextInt();
		
		Employee employee = new Employee();
		switch(choice) {
		
		case 1:
			employee.getAllFinanceEmployee(list);
			break;
		case 2:
			System.out.println("Enter id");
			int id = sc.nextInt();
			employee.getEmployee(list, id);
			break;
		case 3:
			employee.totalSalaryofFinance(list);
			break;
		case 4:
			employee.totalSalaryofManager(list);
			break;
			default:
				System.out.println("Please enter valid option");
		}
	}
}
