package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import address.Address;
import employee.Employee;

public class EmployeeDemo {
	
	public static void main(String[] args) {
		Employee employee = new Employee();
		storeEmployeeDetails(employee);
		showEmployeeDetails(employee);
		
	}
	
	public static void storeEmployeeDetails(Employee employee)
	{
		try 
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter employee id");
			String empId = br.readLine();
			employee.setEmpId(empId);
			System.out.println("Enter employee name");
			String name = br.readLine();
			employee.setEmpName(name);
			Address address = new Address();
			System.out.println("Enter address1");
			String ad1 = br.readLine();
			address.setAddr1(ad1);
			System.out.println("Enter address2");
			String ad2 = br.readLine();
			address.setAddr2(ad2);
			System.out.println("Enter city");
			String city = br.readLine();
			address.setCity(city);
			System.out.println("Enter pin");
			String pin = br.readLine();
			address.setPin(pin);
			employee.setAddress(address);
		}catch(IOException io) {
			
		}
		
	}
	
	public static void showEmployeeDetails(Employee employee)
	{
		System.out.println("Employee id "+employee.getEmpId());
		System.out.println("Employee name "+employee.getEmpName());
		System.out.println("Employee address1 "+employee.getAddress().getAddr1());
		System.out.println("Employee address2 "+employee.getAddress().getAddr2());
		System.out.println("Employee city "+employee.getAddress().getCity());
		System.out.println("Employee pin "+employee.getAddress().getPin());
		
	}

}
