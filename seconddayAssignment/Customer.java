package seconddayAssignment;

public class Customer {
	
	private int cusId;
	private int accId;
	private double creditcardCharges;
	
	public Customer(int cusId, int accId, double creditcardCharges) {
		super();
		this.cusId = cusId;
		this.accId = accId;
		this.creditcardCharges = creditcardCharges;
	}

	public int getCusId() {
		return cusId;
	}

	public int getAccId() {
		return accId;
	}


	public double getCreditcardCharges() {
		return creditcardCharges;
	}

	public void setCreditcardCharges(double creditcardCharges) {
		this.creditcardCharges = creditcardCharges;
	}
	
	
	
}
