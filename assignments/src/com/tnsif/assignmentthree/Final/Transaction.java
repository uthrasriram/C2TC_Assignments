package com.tnsif.assignmentthree.Final;


	public class Transaction {

	    // Final variable - cannot be changed once assigned
	    private final double transactionFee = 25.0; // ₹25 per transaction

	    private String transactionType;
	    private double amount;
	    private double balance;

	    // Constructor
	    public Transaction(String transactionType, double amount, double balance) {
	        this.transactionType = transactionType;
	        this.amount = amount;
	        this.balance = balance;
	    }

	    // Final method - cannot be overridden in subclasses
	    public final void performTransaction() {
	        System.out.println("Performing " + transactionType + " of ₹" + amount);

	        // Transaction logic
	        if (transactionType.equalsIgnoreCase("deposit")) {
	            balance += amount;
	        } else if (transactionType.equalsIgnoreCase("withdraw")) {
	            if (amount + transactionFee <= balance) {
	                balance -= (amount + transactionFee);
	            } else {
	                System.out.println("Insufficient balance! Transaction failed.");
	                return;
	            }
	        } else {
	            System.out.println("Invalid transaction type!");
	            return;
	        }

	        // Deduct transaction fee (for all types)
	        balance -= transactionFee;

	        System.out.println("Transaction Fee: ₹" + transactionFee);
	        System.out.println("Transaction successful. Updated Balance: ₹" + balance);
	    }

	    // Getter for balance
	    public double getBalance() {
	        return balance;
	    }
	}


