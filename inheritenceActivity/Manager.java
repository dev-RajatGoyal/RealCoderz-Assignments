package inheritenceActivity;

public class Manager extends Employee{
	
	public Manager() {
	}
	
	public Manager(long id, String name, String address, long phone, double salary) {
		super.setEmployeeId(id);
		super.setEmployeeName(name);
		super.setEmployeeAddress(address);
		super.setEmployeePhone(phone);
		super.setBasicSalary(salary);
	}
	
	
	public void calculateTransportAllowance() {
		double transportAllowance = 15*this.getBasicSalary()/100;
		System.out.println("Transport Allowance of Manager "+transportAllowance);
	}
}
