package zadaci_04_02_2016;

import java.util.Date;

//Design a class named Account that contains:
public class Account {
	// ■ A private int data field named id for the account (default 0).
	// ■ A private double data field named balance for the account (default 0).
	// ■ A private double data field named annualInterestRate that stores the
	// current interest rate (default 0). Assume all accounts have the same
	// interest rate.
	// ■ A private Date data field named dateCreated that stores the date when
	// the account was created.
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated;

	// A no-arg constructor that creates a default account.
	public Account() {
	}

	// A constructor that creates an account with the specified id and initial
	// balance.
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		this.dateCreated = new Date();
	}

	// The accessor and mutator methods for id, balance, and annualInterestRate.
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		// Note that annualInterestRate is a percentage,e.g., like 4.5%. You
		// need to divide it by 100.
		this.annualInterestRate = annualInterestRate / 100;
	}

	// The accessor method for dateCreated.
	public Date getDateCreated() {
		return dateCreated;
	}

	// A method named getMonthlyInterestRate() that returns the monthly interest
	// rate. monthlyInterestRate is annualInterestRate / 12.
	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}

	// A method named getMonthlyInterest() that returns the monthly interest.
	public double getMontlyInterest() {
		return balance * getMonthlyInterestRate();
	}

	// A method named withdraw that withdraws a specified amount from the
	// account.
	public void withdraw(double kolicina) {
		if (balance > kolicina) {
			balance = balance - kolicina;
		}
	}

	// A method named deposit that deposits a specified amount to the account.
	public void deposit(double kolicina2) {
		balance = balance + kolicina2;
	}
}
