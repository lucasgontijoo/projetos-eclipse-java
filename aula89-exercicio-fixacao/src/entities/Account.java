package entities;

public class Account {
	private int accountNumber;
	private String holder;
	private double balance;

	// Constructors
	public Account(int accountNumber, String holder, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.holder = holder;
		bankDeposit(initialDeposit);
	}

	public Account(int accountNumber, String holder) {
		this.accountNumber = accountNumber;
		this.holder = holder;
	}

	// Getters and Setters
	public int getAccountNumber() {
		return accountNumber;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public double getBalance() {
		return balance;
	}

	// Specific methods
	public void bankDeposit(double value) {
		balance += value;
	}

	public void bankWithdrawal(double value) {
		balance -= (value + 5.00);
	}

	public String toString() {
		return "Account " + accountNumber + ", Holder: " + holder + ", Balance: $ " + String.format("%.2f", balance);
	}
}