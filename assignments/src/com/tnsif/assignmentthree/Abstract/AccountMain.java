package com.tnsif.assignmentthree.Abstract;


	public class AccountMain {
	    public static void main(String[] args) {
	        // Create objects
	        SavingsAccount savings = new SavingsAccount("Alice", 10000);
	        CheckingAccount checking = new CheckingAccount("Bob", 5000);

	        // Perform operations
	        System.out.println("\n--- Savings Account ---");
	        savings.deposit(2000);
	        savings.withdraw(3000);
	        savings.addInterest();
	        savings.displayAccountInfo();

	        System.out.println("\n--- Checking Account ---");
	        checking.deposit(1000);
	        checking.withdraw(8000);
	        checking.displayAccountInfo();

	        // Show final balances
	        System.out.println("\nFinal Savings Balance: ₹" + savings.getBalance());
	        System.out.println("Final Checking Balance: ₹" + checking.getBalance());
	    }
	}


