package inheritenceAssignment2_bankingSystem;

public class OutOfBalanceException extends Exception {
	private double amount;
	private double balance;
	public OutOfBalanceException(double balance, double amount) {
		super();
		this.amount = amount;
		this.balance = balance;
	}
	@Override
	public String getMessage() {
		
		return amount - balance + "";
	}
	
	
}
