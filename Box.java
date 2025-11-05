package com.condegnan.oopexamples;

public class Box {
	
	// using Constructor
	// Instance Variables
		double width;
		double height;
		double depth;
		
		public Box() {
			
			// default constructor
			System.out.println("Box constructor");
			width=20;
			depth=2.0;
			height=3.0;
			
		}
		
		// Parameterized Constructor
		
		public Box(double width,double height,double depth) {
			this.width=width;
			this.height=height;
			this.depth=depth;
		}
		
		// copy constructor
		
		public Box(Box obj) {
			this.width=obj.width;
			this.height=obj.height;
			this.depth=obj.depth;
		}
		
			public double volume() {
				return width*height*depth;
			}
			public static void main(String[] args) {
				Box mybox1=new Box();
				System.out.println(mybox1.volume());
				mybox1.width=5.0;
				mybox1.depth=3.0;
				mybox1.height=2.0;
				System.out.println(mybox1.volume());
				
				Box mybox2=new Box();
				mybox2.width=50.0;
				mybox2.depth=30.0;
				mybox2.height=20.0;
				System.out.println(mybox2.volume()); 
				
				Box mybox3=new Box(2.5,2.0,3.0);
				System.out.println(mybox3.volume());
				
				// copy constructor
				Box mybox4=new Box(mybox3);
				System.out.println("Copy constructor : "+mybox4.volume());
				
			
			
				
	/*
	// without constructor
	// Instance Variables
	double width;
	double height;
	double depth;
	
	public double volume() {
		return width*height*depth;
	}
	public static void main(String[] args) {
		Box mybox1=new Box();
		mybox1.width=5.0;
		mybox1.depth=3.0;
		mybox1.height=2.0;
		System.out.println(mybox1.volume());
		
		Box mybox2=new Box();
		mybox2.width=50.0;
		mybox2.depth=30.0;
		mybox2.height=20.0;
		System.out.println(mybox2.volume()); */
	}
}
