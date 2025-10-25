package com.tnsif.assignmentthree.Static;

public class BankMain {
	public static void main(String[] args) {
	Bank acc1 = new Bank("Alice", 5000);
    acc1.displayAccountInfo();

    // Create second bank account
    Bank acc2 = new Bank("Bob", 10000);
    acc2.displayAccountInfo();

    // Perform some transactions
    acc1.deposit(2000);
    acc2.withdraw(3000);

    // Display total number of accounts using static method
    System.out.println("\nTotal Bank Accounts: " + Bank.getTotalAccounts());
}
}

