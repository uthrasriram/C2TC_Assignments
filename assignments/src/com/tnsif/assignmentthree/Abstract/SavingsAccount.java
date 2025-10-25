package com.tnsif.assignmentthree.Abstract;

	public class SavingsAccount extends Account {
	    private double interestRate = 0.03; // 3% interest

	    public SavingsAccount(String name, double initialBalance) {
	        super(name, initialBalance);
	    }

	    @Override
	    public void deposit(double amount) {
	        balance += amount;
	        System.out.println("Deposited ₹" + amount + " to Savings Account.");
	    }

	    @Override
	    public void withdraw(double amount) {
	        if (balance - amount >= 1000) { // Minimum balance rule
	            balance -= amount;
	            System.out.println("Withdrawn ₹" + amount + " from Savings Account.");
	        } else {
	            System.out.println("Cannot withdraw! Minimum balance of ₹1000 must be maintained.");
	        }
	    }

	    @Override
	    public double getBalance() {
	        return balance;
	    }

	    // Additional method to add interest
	    public void addInterest() {
	        double interest = balance * interestRate;
	        balance += interest;
	        System.out.println("Interest added: ₹" + interest);
	    }
	
	}


