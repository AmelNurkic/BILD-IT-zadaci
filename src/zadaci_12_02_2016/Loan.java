package zadaci_12_02_2016;

import java.util.*;
import java.lang.IllegalArgumentException;

public class Loan {
	/**
	 * osobine -annualInterestRate: double -numberOfYears: int -loanAmount:
	 * double -loanDate: java.util.Date
	 */
	double annualInterestRate;
	int numberOfYears;
	double loanAmount;
	Date loanDate;

	// konstruktori
	Loan() {
		this.annualInterestRate = 2.5;
		this.numberOfYears = 1;
		this.loanAmount = 1000;
		this.loanDate = new Date();
	}

	Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
		if (annualInterestRate<0 || numberOfYears<0 || loanAmount<0) {
		      throw new IllegalArgumentException("Annual interest rate, number of years and loan amount must be greater than 0");
		    }
		this.annualInterestRate = annualInterestRate;
		this.numberOfYears = numberOfYears;
		this.loanAmount = loanAmount;
		this.loanDate = new Date();
	}
}
