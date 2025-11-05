package com.condegnan.oopexamples;

import java.util.Scanner;

public class EmployeeAQ1 {
	int empId;
	String name;
	double salary;
	int experience;
	
	// Default Constructor
	public EmployeeAQ1() {
		this(0, "Unknown", 0.0, 0);
	}
	
	// Constructor with 2 parameters
	public EmployeeAQ1(int empId, String name) {
		this(empId, name, 0.0, 0);
	}
	
	// Constructor with 4 parameters
    public EmployeeAQ1(int empId, String name, double salary, int experience) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.experience = experience;
    }
    
    // Method to calculate bonus
    public double calculateBonus() {
        if (this.experience < 3)
            return this.salary * 0.05;
        else if (this.experience <= 7)
            return this.salary * 0.10;
        else
            return this.salary * 0.15;
    }
    
 // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("ID: " + this.empId);
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
        System.out.println("Experience: " + this.experience);
        System.out.println("Bonus: " + this.calculateBonus());
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        String name = sc.next();
        double salary = sc.nextDouble();
        int exp = sc.nextInt();
        sc.close();
        
        EmployeeAQ1 e1 = new EmployeeAQ1(id, name, salary, exp);
        e1.displayDetails();
    }
}
