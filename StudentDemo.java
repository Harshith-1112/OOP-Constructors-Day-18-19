package com.codegnan.oopconstructorsaq;

public class StudentDemo {
	public static void main(String[] args) {
        // Object using default constructor
        Student s1 = new Student();

        // Object using parameterized constructor
        int[] marks = {85, 90, 88};
        Student s2 = new Student("Harshith", 101, marks);

        // Display details of both students
        System.out.println("=== Student 1 (Default Constructor) ===");
        s1.displayDetails();
        System.out.println("Total Marks: " + s1.calculateTotal());
        System.out.println("Average Marks: " + s1.calculateAverage());

        System.out.println("\n=== Student 2 (Parameterized Constructor) ===");
        s2.displayDetails();
        System.out.println("Total Marks: " + s2.calculateTotal());
        System.out.println("Average Marks: " + s2.calculateAverage());
    }
}

