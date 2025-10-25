package com.tnsif.assignmentthree.Static;

	public class Bank {
	    // Static variable shared by all Bank objects
	    private static int totalAccounts = 0;

	    // Instance variables
	    private String accountHolderName;
	    private double balance;

	    // Constructor
	    public Bank(String name, double initialDeposit) {
	        this.accountHolderName = name;
	        this.balance = initialDeposit;
	        totalAccounts++; // Increment when new account is created
	        System.out.println("Account created for: " + name);
	    }

	    // Static method to get total accounts
	    public static int getTotalAccounts() {
	        return totalAccounts;
	    }

	    // Method to display account details
	    public void displayAccountInfo() {
	        System.out.println("Account Holder: " + accountHolderName);
	        System.out.println("Balance: ₹" + balance);
	    }

	    // Deposit money
	    public void deposit(double amount) {
	        balance += amount;
	        System.out.println("Deposited ₹" + amount + ". New Balance: ₹" + balance);
	    }

	    // Withdraw money
	    public void withdraw(double amount) {
	        if (amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrawn ₹" + amount + ". Remaining Balance: ₹" + balance);
	        } else {
	            System.out.println("Insufficient balance!");
	        }
	    }
	}

