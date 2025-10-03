package com.tnsif.assignmenttwo;

		// TODO Auto-generated method stub
		import java.util.Scanner;

		// Student class with default constructor
		class Student {
		    // Default constructor
		    Student() {
		        System.out.println("Student object is created");
		    }
		}

		// Commission class
		class Commission {
		    // Data members
		    private String name;
		    private String address;
		    private String phone;
		    private double salesAmount;

		    // Method to accept details of the sales employee
		    public void acceptDetails() {
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter Name: ");
		        name = sc.nextLine();

		        System.out.print("Enter Address: ");
		        address = sc.nextLine();

		        System.out.print("Enter Phone: ");
		        phone = sc.nextLine();

		        System.out.print("Enter Sales Amount: ");
		        salesAmount = sc.nextDouble();
		    }

		    // Method to calculate and display commission
		    public void calculateCommission() {
		        double commission;
		        if (salesAmount >= 100000) {
		            commission = salesAmount * 0.10;
		        } else if (salesAmount >= 50000) {
		            commission = salesAmount * 0.05;
		        } else if (salesAmount >= 30000) {
		            commission = salesAmount * 0.03;
		        } else {
		            commission = 0;
		        }

		        System.out.println("\n--- Employee Details ---");
		        System.out.println("Name: " + name);
		        System.out.println("Address: " + address);
		        System.out.println("Phone: " + phone);
		        System.out.println("Sales Amount: " + salesAmount);
		        System.out.println("Commission: " + commission);
		    }
		}

		// Main class
		public class Main {
		    public static void main(String[] args) {
		        // Create Student object -> invokes default constructor
		        Student s = new Student();

		        // Create Commission object
		        Commission c = new Commission();

		        // Accept details
		        c.acceptDetails();

		        // Calculate and print commission
		        c.calculateCommission();
		    }
		

	}


