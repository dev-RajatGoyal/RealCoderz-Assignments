package classesAndObjects;

import java.util.Scanner;

public class BankAccount {
	
//	6.	Create a class called BankAccount with AcctNo , balance ,AcctType as data members.
//	Create objects to hold specific values of the data members which are initialized using constructors.
//	Write functions to perform the below operations
//	a)	To deposit an amount of 10000
//	b)	To withdraw an amount of 5000
//	c)	To display the AccountDetails
	
	private int accNo;
	private String accType;
	private int balance;
	
	public BankAccount(int accNo, String accType, int balance) {
		super();
		this.accNo = accNo;
		this.accType = accType;
		this.balance = balance;
	}
	
	public static void main(String[] args) 
	{
		BankAccount account = new BankAccount(1001, "Savings", 50000);
		Scanner sc = new Scanner(System.in);
		System.out.println("select option given below");
		System.out.println("Press 1 to deposite an amount of 10000");
		System.out.println("Press 2 to withdraw an amount of 5000");
		System.out.println("Press 3 to display the AccountDetails");
		
		int n = sc.nextInt();
		switch(n) {
			case 1:
				deposite(account.balance);
				break;
			case 2:
				withdraw(account.balance);
				break;
			case 3:
				displayDetails(account);
				break;
				default :
					System.out.println("please select a valid option");
		}
	}
	
	private static void deposite(int balance)
	{
		System.out.println("previous balance is "+balance);
		balance += 10000;
		System.out.println("10000 has been deposited to your account, your current balance is "+balance);
	}
	
	private static void withdraw(int balance)
	{
		System.out.println("previous balance is "+balance);
		balance -= 5000;
		System.out.println("5000 has been withdrawl to your account, your current balance is "+balance);
	}
	
	private static void displayDetails(BankAccount account)
	{
		System.out.println("Account No "+account.accNo);
		System.out.println("Account Type "+account.accType);
		System.out.println("Account Balance "+account.balance);
	}

}
