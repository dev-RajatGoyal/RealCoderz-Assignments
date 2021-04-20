package inheritenceAssignment2_bankingSystem;

public class SavingAccount extends Account {


	public SavingAccount(int accountId, int customerId, double balance) {
		super(accountId, customerId, balance);
	}

	@Override
	public double deposite(double amount) {	
		this.setBalance(this.getBalance() + amount);
		return this.getBalance();
	}

	@Override
	public double withdraw(double amount) {
		this.setBalance(this.getBalance()-amount);
		return this.getBalance();
	}

}
