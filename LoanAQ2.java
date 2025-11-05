package com.condegnan.oopexamples;

import java.util.Scanner;

public class LoanAQ2 {
	 int loanId;
	    String customerName;
	    double loanAmount;
	    String loanType;

	    // Default constructor
	    public LoanAQ2() {
	        this(0, "Unknown", 0.0, "Unknown");
	    }
	    
	 // Constructor with 2 parameters
	    public LoanAQ2(int loanId, String customerName) {
	        this(loanId, customerName, 0.0, "Unknown");
	    }

	    // Constructor with 4 parameters
	    public LoanAQ2(int loanId, String customerName, double loanAmount, String loanType) {
	        this.loanId = loanId;
	        this.customerName = customerName;
	        this.loanAmount = loanAmount;
	        this.loanType = loanType;
	    }
	    
	 // Method to calculate total payable amount
	    public double calculateTotalPayable() {
	        double interestRate = 0.0;

	        if (this.loanType.equalsIgnoreCase("Home")) {
	            interestRate = 8.0;
	        } else if (this.loanType.equalsIgnoreCase("Car")) {
	            interestRate = 9.0;
	        } else if (this.loanType.equalsIgnoreCase("Personal")) {
	            interestRate = 11.0;
	        } else {
	            System.out.println("Invalid loan type!");
	        }

	        return this.loanAmount + (this.loanAmount * interestRate / 100);
	    }
	 // Method to display loan details
	    public void displayDetails() {
	        System.out.println("Loan Details:");
	        System.out.println("Loan ID: " + this.loanId);
	        System.out.println("Customer Name: " + this.customerName);
	        System.out.println("Loan Amount: " + this.loanAmount);
	        System.out.println("Loan Type: " + this.loanType);
	        System.out.println("Total Payable: " + this.calculateTotalPayable());
	    }

	    // Main method
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int id = sc.nextInt();
	        String name = sc.next();
	        double amount = sc.nextDouble();
	        String type = sc.next();
	        sc.close();

	        LoanAQ2 l1 = new LoanAQ2(id, name, amount, type);
	        l1.displayDetails();
	    }

}
