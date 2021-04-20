package inheritenceAssignment2_bankingSystem;

import java.util.ArrayList;

public class Bank {
	
	private ArrayList<Account> list;

	public Bank() {
		list = new ArrayList<Account>();	
	}
	
	public boolean addAccount(Account account) {
		
		boolean flag = true;
		for(Account acc : list) {
			if(acc.getAccountId()==account.getAccountId()) {
	
				flag = false;
				break;
			}
		}
		
		if(flag){
			list.add(account);
		}
		
		return flag;
	}
	
	public double deposite(int acc_Id, double amount) {
		double balance = -1;
		for(Account acc : list) {
			if(acc.getAccountId() == acc_Id) {
				acc.setBalance(acc.getBalance()+amount);
				balance = acc.getBalance();
			}
		}
		return balance;
	}
	
	public double withdraw(int acc_Id, double amount) throws OutOfBalanceException {
		double balance = -1;
		for(Account acc : list) {
			if(acc.getAccountId() == acc_Id) {
				if(acc.getBalance() >= amount) {
					acc.setBalance(acc.getBalance()-amount);
					balance = acc.getBalance();
				} else {
					throw new OutOfBalanceException(acc.getBalance(), amount);
				}
			}
		}
		return balance;
	}
}
