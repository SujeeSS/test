package com.constructor;

public class Main {
	int x;
	int y;
	//no arguments 
//	public Main() {
//		System.out.println("constructor");
//	}
	//default 
	public Main() {
		System.out.println(x);
		
	}
	
	//parameterized constructor
	public Main(int a,int b, int y) {
		this.y=y;
		System.out.println(a+b+x);
		
		
	}
	
	public Main(String name, int age) {
		System.out.println(name);
		System.out.println(age);
		
	}

	
	public static void main(String[] args) {
	
		//constructor
		// constructor is a special method
		//No Return Type
		//When an object of a class is created, the constructor is called automatically to initialize the object’s attributes.
		//syntax 
//		accessmodifier constructorname{
//	}
		
		
		Main main=new Main();
		Main main1=new Main(2,4,6);
		Main main2=new Main("sujeendhar",21);
		
//		types 
//		1. no argument 
//		2.default constructor
//		3.parameterized constructor 
//		4.copy constructor 
		
		
		
	}
}
