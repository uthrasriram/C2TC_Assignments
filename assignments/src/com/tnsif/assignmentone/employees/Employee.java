package com.tnsif.assignmentone.employees;


		// TODO Auto-generated method stub
		

		/**
		 * The Employee class represents a general employee with
		 * basic attributes such as name, employeeId, and salary.
		 * Attributes are private and accessed through getters/setters.
		 */
		public class Employee {
		    private String name;
		    private int employeeId;
		    private double salary;

		    // Constructor
		    public Employee(String name, int employeeId, double salary) {
		        this.name = name;
		        this.employeeId = employeeId;
		        this.salary = salary;
		    }

		    // Getters and Setters
		    public String getName() {
		        return name;
		    }

		    protected void setName(String name) { // Protected: accessible within package and subclasses
		        this.name = name;
		    }

		    public int getEmployeeId() {
		        return employeeId;
		    }

		    private void setEmployeeId(int employeeId) { // Private: only accessible inside this class
		        this.employeeId = employeeId;
		    }

		    public double getSalary() {
		        return salary;
		    }

		    public void setSalary(double salary) { // Public setter for salary
		        this.salary = salary;
		    }

		    // Display details
		    public void displayInfo() {
		        System.out.println("Employee: " + name + ", ID: " + employeeId + ", Salary: " + salary);
		    }
		}


