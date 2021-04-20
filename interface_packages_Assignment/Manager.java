package interface_packages_Assignment;

import java.util.List;

public interface Manager 
{
	void getAllFinanceEmployee(List<Employee> employees);
	
	void getEmployee(List<Employee> employees, int employeeId);
	
	void totalSalaryofFinance(List<Employee> employees);
	
	void totalSalaryofManager(List<Employee> employees);
	
}
