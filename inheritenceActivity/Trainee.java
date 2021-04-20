package inheritenceActivity;

public class Trainee extends Employee {
	
	public Trainee() {
		// TODO Auto-generated constructor stub
	}
	
	public Trainee(long id, String name, String address, long phone, double salary) {
		super.setEmployeeId(id);
		super.setEmployeeName(name);
		super.setEmployeeAddress(address);
		super.setEmployeePhone(phone);
		super.setBasicSalary(salary);
	}

	@Override
	public void calculateTransportAllowance() {

		double transportAllowance = 10*this.getBasicSalary()/100;
		System.out.println("Transport Allowance of Trainee "+transportAllowance);
	}
}
