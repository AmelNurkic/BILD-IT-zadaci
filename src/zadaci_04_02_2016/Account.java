/**(The Account class) Design a class named Account that contains:
■ A private int data field named id for the account (default 0).
■ A private double data field named balance for the account (default 0).
■ A private double data field named annualInterestRate that stores the current
interest rate (default 0). Assume all accounts have the same interest rate.
■ A private Date data field named dateCreated that stores the date when the
account was created.
■ A no-arg constructor that creates a default account.
■ A constructor that creates an account with the specified id and initial balance.
■ The accessor and mutator methods for id, balance, and annualInterestRate.
■ The accessor method for dateCreated.
■ A method named getMonthlyInterestRate() that returns the monthly
interest rate.
■ A method named getMonthlyInterest() that returns the monthly interest.
■ A method named withdraw that withdraws a specified amount from the
account.
■ A method named deposit that deposits a specified amount to the account.
Draw the UML diagram for the class and then implement the class. (Hint: The
method getMonthlyInterest() is to return monthly interest, not the interest rate.
Monthly interest is balance * monthlyInterestRate. monthlyInterestRate
is annualInterestRate / 12. Note that annualInterestRate is a percentage,
e.g., like 4.5%. You need to divide it by 100.)
Write a test program that creates an Account object with an account ID of 1122,
a balance of $20,000, and an annual interest rate of 4.5%. Use the withdraw
method to withdraw $2,500, use the deposit method to deposit $3,000, and print
the balance, the monthly interest, and the date when this account was created.
*/
package zadaci_04_02_2016;

import java.util.*;

public class Account {

	// osobine
	private int id;// (default 0)
	private double balance;// (default 0)
	private double annualInterestRate; // default 0
	private Date dateCreated; // when the account was created

	// no-arg constructor
	public Account() {

	}

	// A constructor that creates an account with the specified id and initial
	// balance.
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		this.dateCreated = new Date();
	}

	// methods
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
		this.annualInterestRate = annualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public double getMonthlyInterestRate() {
		return (annualInterestRate / 100) / 12;
	}

	public double getMonthlyInterest() {
		return (balance * getMonthlyInterestRate());
	}

	// Isplate, ostavi 10 za odrzavanje racuna
	public void withdraw(double money) {
		if ((balance - money) > 10)
			balance = balance - money;
	}

	// Uplate
	public void deposit(double money) {
		balance = balance + money;
	}

	public static void main(String[] args) {
		/*
		 * Write a test program that creates an Account object with an account
		 * ID of 1122, a balance of $20,000, and an annual interest rate of
		 * 4.5%. Use the withdraw method to withdraw $2,500, use the deposit
		 * method to deposit $3,000, and print the balance, the monthly
		 * interest, and the date when this account was created.
		 */
		Account racun = new Account(1122, 20000);
		racun.annualInterestRate = 4.5;
		racun.withdraw(2500);
		racun.deposit(3000);
		System.out.println("ID: " + racun.getId() + " " + "Date created: " + racun.getDateCreated() + " " + "Balance: "
				+ racun.getBalance() + " " + " AIT: " + racun.getAnnualInterestRate() + " Monthly interest: "
				+ racun.getMonthlyInterest());
	}

}
