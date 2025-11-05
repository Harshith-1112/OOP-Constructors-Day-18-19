package com.condegnan.oopexamples;

import java.util.Scanner;

public class Student {
	String name;
	int rollNumber;
	int grade;
	
	public Student(String name,int rollNumber, int grade) {
		if(name==null||name.trim().isEmpty()) {
			System.out.println("Name cannot be empty or null");
			
		}
		if(rollNumber<=0) {
			System.out.println("Roll NUmber must be Positive");
		}
		if(grade<1||grade>12) {
			System.out.println("Grade Level Must be Between 1 to 12");
		}
		this.name=name;
		this.rollNumber=rollNumber;
		this.grade=grade;

	}
	public String showProfile() {
		return "Name : " + name +", Roll Number : "+rollNumber+",Grade : "+grade;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		int roll=sc.nextInt();
		int grade=sc.nextInt();
		Student s1=new Student(name,roll,grade);
		System.out.println(s1.showProfile());
		sc.close();

	}

}
