package com.condegnan.oopexamples;

public class Employe {
	int id;
	String name;
	String department;
	
	// default constructor
	public Employe() {
		this(0,"unknown");
		System.out.println("Default constructor called");
	}
	public Employe(int id,String name) {
		this(id,name,"unassigned");
		System.out.println("2-parameter constructor called");
	}
	public Employe(int id, String name, String department) {
		this.name=name;
		this.id=id;
		this.department=department;
		System.out.println("3 parameter constructor called");
	}
	public void displayInfo() {
		System.out.println("Employe Id: "+ this.id);
		System.out.println(("Employe Name: "+ this.name));
		System.out.println("Department : "+ department);
	}
	public static void main(String[] args) {
		Employe e1=new Employe(18,"Harshi","ECE");
		e1.displayInfo();
	}
}
