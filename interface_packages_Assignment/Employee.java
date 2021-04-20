package interface_packages_Assignment;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Manager{
	
	private int employeeId;
	private String employeeName;
	private int employeeSalary;
	private String employeeDepartment;
	private String employeeDesignation;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int employeeId, String employeeName, int employeeSalary, String employeeDepartment,
			String employeeDesignation) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.employeeDepartment = employeeDepartment;
		this.employeeDesignation = employeeDesignation;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public String getEmployeeDepartment() {
		return employeeDepartment;
	}

	public void setEmployeeDepartment(String employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}

	public String getEmployeeDesignation() {
		return employeeDesignation;
	}

	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}

	@Override
	public void getAllFinanceEmployee(List<Employee> employees) {
		
		List<Employee> list = new ArrayList<Employee>();
		for(Employee employee : employees)
		{
			if(employee.getEmployeeDepartment().equals("Finanace"))
			{
				list.add(employee);
			}
		}
		
		int count = 0;
		for(Employee employee : list)
		{
			System.out.println("Details of employee "+count);
			System.out.println("Employee Id "+employee.getEmployeeId());
			System.out.println("Employee Name "+employee.getEmployeeName());
			System.out.println("Employee Salary "+employee.getEmployeeSalary());
			System.out.println("Employee Department "+employee.getEmployeeDepartment());
			System.out.println("Employee Designation "+employee.getEmployeeDesignation());
		}
		
	}

	@Override
	public void getEmployee(List<Employee> employees, int employeeId) {
		
		for(Employee employee : employees)
		{
			if(employee.getEmployeeId() == employeeId)
			{
				System.out.println("Employee found");
				System.out.println("Employee id "+employee.getEmployeeId());
				System.out.println("Employee Name "+employee.getEmployeeName());
				System.out.println("Employee Salary "+employee.getEmployeeSalary());
				System.out.println("Employee Department "+employee.getEmployeeDepartment());
				System.out.println("Employee Designation "+employee.getEmployeeDesignation());
			}
		}
	}

	@Override
	public void totalSalaryofFinance(List<Employee> employees) {
		
		int totalSalary = 0;
		for(Employee employee : employees)
		{
			if(employee.getEmployeeDepartment().equals("Finance")) 
			{
				totalSalary = employee.getEmployeeSalary() + totalSalary;
			}
		}
		
		System.out.println("Total salary of all employee working in Finance Department :"+totalSalary);
	}

	@Override
	public void totalSalaryofManager(List<Employee> employees) {
		
		int totalSalary = 0;
		for(Employee employee : employees)
		{
			if(employee.getEmployeeDesignation().equals("Manager"))
			{
				totalSalary = totalSalary + employee.getEmployeeSalary();
			}
		}
		
		System.out.println("Total salary of all employee working as Manager :"+totalSalary);
	}

	
	
}
