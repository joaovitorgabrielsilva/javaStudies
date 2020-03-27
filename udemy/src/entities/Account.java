package entities;

public class Account {
	private int number;
	private String holder;
	private double balance;
	
	public Account(int number, String holder, double initialDeposit) {
		//super(); -> tem a ver com ser a super classe
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}
	
	public Account(int number, String holder) {
		//super(); -> tem a ver com ser a super classe
		this.number = number;
		this.holder = holder;
		//balance = 0.0; n precisa do this pois n tem ambiguidade. nao precisa desse uso pois � iniciado automaticamente como 0.0
	}
	
	public int getNumber() {
		return number;		
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
	
	public void deposit(double amount) {
		balance += amount;
	}
	public void withdraw(double amount) {
		balance -= (amount + 5.0);
	}
	
	
	public String toString() {
		return "Account " + number 
				+ ", Holder: " + holder 
				+ ", Balance: $ " + String.format("%.2f", balance); 
	}
}
