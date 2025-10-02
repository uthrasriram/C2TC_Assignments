package com.tnsif.assignmentone;


		// TODO Auto-generated method stub
		import com.tnsif.assignmentone.employees.*;
		import com.tnsif.assignmentone.utilities.EmployeeUtilities;

		/**
		 * Main class to demonstrate packages, access modifiers, and utilities.
		 */
		public class AssignmentMain {
		    public static void main(String[] args) {
		        // Create Manager and Developer objects
		        Manager mgr = new Manager("Alice", 101, 80000, "HR");
		        Developer dev = new Developer("Bob", 102, 60000, "Java");

		        // Show details
		        System.out.println("=== Before Salary Update ===");
		        EmployeeUtilities.showEmployeeDetails(mgr);
		        EmployeeUtilities.showEmployeeDetails(dev);

		        // Increase salary
		        EmployeeUtilities.increaseSalary(mgr, 10);
		        EmployeeUtilities.increaseSalary(dev, 15);

		        System.out.println("\n=== After Salary Update ===");
		        EmployeeUtilities.showEmployeeDetails(mgr);
		        EmployeeUtilities.showEmployeeDetails(dev);
		    }
		

	}


