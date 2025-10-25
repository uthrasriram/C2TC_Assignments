package com.tnsif.assignmentthree.Abstract;

	public class CheckingAccount extends Account {
	    private double overdraftLimit = 5000;

	    public CheckingAccount(String name, double initialBalance) {
	        super(name, initialBalance);
	    }

	    @Override
	    public void deposit(double amount) {
	        balance += amount;
	        System.out.println("Deposited ₹" + amount + " to Checking Account.");
	    }

	    @Override
	    public void withdraw(double amount) {
	        if (balance + overdraftLimit >= amount) {
	            balance -= amount;
	            System.out.println("Withdrawn ₹" + amount + " from Checking Account.");
	        } else {
	            System.out.println("Overdraft limit exceeded! Cannot withdraw ₹" + amount);
	        }
	    }

	    @Override
	    public double getBalance() {
	        return balance;
	    }
	}


