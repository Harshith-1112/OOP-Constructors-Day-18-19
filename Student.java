package com.codegnan.oopconstructorsaq;

class Student {
	String name;
	int rollNumber;
	int[] marks=new int[3];
	
	// Default Constructor
	Student() {
		name="Unknown";
		rollNumber=0;
		marks[0]=0;
		marks[1]=0;
		marks[2]=0;
	}
	
	// Parameterized Constructor 
	Student(String name, int rollNumber, int[] marks){
		this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.print("Marks: ");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println();
    }

    // Method to calculate total
    int calculateTotal() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    // Method to calculate average
    double calculateAverage() {
        return calculateTotal() / 3.0;
    }
}
