package com.tnsif.assignmentone.utilities;


	import com.tnsif.assignmentone.employees.Employee;

	/**
	 * Utility class for Employee-related operations.
	 */
	public class EmployeeUtilities {

	    /**
	     * Increase salary of an employee by a given percentage.
	     * @param emp Employee object
	     * @param percent Percentage to increase
	     */
	    public static void increaseSalary(Employee emp, double percent) {
	        double newSalary = emp.getSalary() + (emp.getSalary() * percent / 100);
	        emp.setSalary(newSalary);
	        System.out.println(emp.getName() + "'s salary increased by " + percent + "%.");
	    }

	    /**
	     * Display employee details using polymorphism.
	     * @param emp Employee object
	     */
	    public static void showEmployeeDetails(Employee emp) {
	        emp.displayInfo();
	    }
	}



