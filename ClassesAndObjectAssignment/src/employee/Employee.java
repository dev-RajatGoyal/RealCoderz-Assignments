package employee;

import address.Address;

public class Employee {

//	empID : string
//	empName : string
//	address : Address
//	ii. Methods
//	Set methods and get methods for the data members

	private String empId;
	private String empName;
	private Address address;
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
