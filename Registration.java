package com.codegnan.oopconstructorsaq;

import java.util.Scanner;

class GreenwoodRegistration {
	String name;
    int rollNumber;
    int gradeLevel;

    // Parameterized constructor with validation
    GreenwoodRegistration(String name, int rollNumber, int gradeLevel) throws Exception {
        if (name == null || name.trim().isEmpty()) {
            throw new Exception("Name cannot be empty or null");
        }
        if (rollNumber <= 0) {
            throw new Exception("Roll number must be positive");
        }
        if (gradeLevel < 1 || gradeLevel > 12) {
            throw new Exception("Grade level must be between 1 and 12");
        }

        this.name = name;
        this.rollNumber = rollNumber;
        this.gradeLevel = gradeLevel;
    }

    void showProfile() {
        System.out.println("Name: " + name + ", Roll Number: " + rollNumber + ", Grade: " + gradeLevel);
    }
}
 class Registration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int roll = sc.nextInt();
        int grade = sc.nextInt();

        try {
        	GreenwoodRegistration r = new GreenwoodRegistration(name, roll, grade);
            r.showProfile();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}

