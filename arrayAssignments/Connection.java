package arrayAssignments;

public class Connection {

	private int connId;
	private int customerId;
	private String customerEmail;
	private double balance;
	
	public Connection(int connId, int customerId, String customerEmail, double balance) {
		super();
		this.connId = connId;
		this.customerId = customerId;
		this.customerEmail = customerEmail;
		this.balance = balance;
	}

	public int getConnId() {
		return connId;
	}

	public int getCustomerId() {
		return customerId;
	}


	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
