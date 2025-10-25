package com.tnsif.assignmentfive;

	import java.util.Scanner;

	public class Main {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Read ticket booking details (CSV)
	        String details = sc.nextLine();
	        String[] parts = details.split(",");

	        String stageEvent = parts[0];
	        String customer = parts[1];
	        int noOfSeats = Integer.parseInt(parts[2]);

	        TicketBooking tb = new TicketBooking(stageEvent, customer, noOfSeats);

	        // Read payment mode
	        int choice = sc.nextInt();
	        sc.nextLine(); // consume newline

	        switch (choice) {
	            case 1: // Cash payment
	                double amount1 = sc.nextDouble();
	                tb.makePayment(amount1);
	                break;

	            case 2: // Wallet payment
	                double amount2 = sc.nextDouble();
	                sc.nextLine();
	                String walletNumber = sc.nextLine();
	                tb.makePayment(walletNumber, amount2);
	                break;

	            case 3: // Credit card payment
	                String name = sc.nextLine();
	                double amount3 = sc.nextDouble();
	                sc.nextLine();
	                String creditCard = sc.nextLine();
	                String ccv = sc.nextLine();
	                tb.makePayment(name, amount3, creditCard, ccv);
	                break;

	            default:
	                System.out.println("Invalid choice");
	        }

	        sc.close();
	    }
	}


